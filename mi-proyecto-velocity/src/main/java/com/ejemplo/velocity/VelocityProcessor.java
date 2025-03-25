package com.ejemplo.velocity;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class VelocityProcessor {

    public static void main(String[] args) {
        // Initialize Velocity
        Properties props = new Properties();
        props.setProperty("resource.loader", "file");
        props.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
        props.setProperty("file.resource.loader.path", "src/main/resources/"); // Path to templates

        VelocityEngine velocityEngine = new VelocityEngine(props);
        velocityEngine.init();

        // Load the template
        Template template = velocityEngine.getTemplate("Design_B.vm");

        // Create context and add data (this would come from your JSON file)
        VelocityContext context = new VelocityContext();
        context.put("name", "John Doe");
        context.put("rating", "★★★★★");
        context.put("photo", "https://example.com/photo.jpg");
        context.put("link", "https://example.com/profile");

        // Render the template
        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        // Print result
        System.out.println(writer.toString());
    }
}
