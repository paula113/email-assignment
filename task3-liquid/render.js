const { Liquid } = require("liquidjs");
const fs = require("fs");

// Initialize LiquidJS engine
const engine = new Liquid();

// Load template and data
const templateFile = "views/email_design_B.liquid";
const dataFile = "data/default.json";
const outputFile = "output.html";

// Read template file
const template = fs.readFileSync(templateFile, "utf8");

// Read data file
const data = JSON.parse(fs.readFileSync(dataFile, "utf8"));

// Render Liquid template with data
engine.parseAndRender(template, data)
  .then((output) => {
    // Write output to an HTML file
    fs.writeFileSync(outputFile, output, "utf8");
    console.log(`✅ HTML file generated: ${outputFile}`);
  })
  .catch((err) => {
    console.error("Error rendering template:", err);
  });
