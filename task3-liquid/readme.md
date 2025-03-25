# LiquidJS HTML Generator

This project uses **LiquidJS** to process a Liquid template and generate a static HTML file with dynamic data.

## Project Structure
```
task3-liquid/
├── views/
│   ├── email_design_B.liquid    # Liquid template with HTML/CSS
├── data/
│   ├── default.json          # JSON file containing dynamic data
├── render.js          # Node.js script to process the template
├── output.html        # Generated HTML file (output)
├── README.md          # Project documentation
├── package.json       # NPM package file
```

## Setup & Usage

### Install Dependencies
Make sure you have **Node.js** installed, then run:
```sh
cd task3-liquid
npm install
```

### Update Data
Modify `data.json` to change the dynamic content.

### Generate HTML
Run the following command:
```sh
node render.js
```
This will create an `output.html` file with all Liquid variables replaced.

### Open in Browser
Simply open `output.html` in any web browser to preview the generated content.

## Features
- Uses **LiquidJS** for templating
- Supports **JSON data binding**
- Generates **static HTML** output

## Requirements  
- Converts the **product card logic** from Velocity to Liquid.  
- Maintain **HTML and inline CSS** best practices for email compatibility.  
- Ensure the product card is a **reusable component**.  
- Saves the file as **`.html`**, even though it contains Liquid syntax.  

## How to Use  
-  Open the file in a browser to preview its structure.
- Send a test email using PutsMail to check rendering in email clients.

## Guidelines 
- [x] Use only inline CSS for styling.
- [x] Avoid external stylesheets as they are not fully supported in email clients.
- [x] Ensure the layout is responsive and displays correctly on both desktop and mobile.
- [x] Test in different email clients to confirm compatibility.