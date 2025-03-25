package com.ejemplo.velocity;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class GenerateHtml {
  public static void main(String[] args) throws Exception {
    // Configurar Velocity
    Properties props = new Properties();
    props.setProperty("resource.loader", "file");
    props.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
    props.setProperty("file.resource.loader.path", "src/main/resources");
    VelocityEngine velocityEngine = new VelocityEngine(props);
    velocityEngine.init();

    // Leer el archivo JSON con los datos
    ObjectMapper objectMapper = new ObjectMapper();
    Map<String, Object> data = objectMapper.readValue(new File("src/main/resources/sample_data.json"), Map.class);

    // Crear el contexto y agregar los datos
    VelocityContext context = new VelocityContext(data);

    // Cargar la plantilla
    StringWriter writer = new StringWriter();
    velocityEngine.getTemplate("template.vm").merge(context, writer);

    // Guardar la salida en un archivo HTML
    try (FileWriter fileWriter = new FileWriter("email_template_velocity.html")) {
      fileWriter.write(writer.toString());
    }

    System.out.println("HTML generado: email_template_velocity.html");
  }
}
