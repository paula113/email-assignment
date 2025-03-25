# Task 2 - Velocity Email Template

## Project Overview
This project involves generating an email template using the Velocity templating engine. The goal is to create an HTML email based on `Design_B.png`, incorporating dynamic data from `sample_data.json`. The email template should be compatible with various email platforms.

## Setup and Execution

### Prerequisites
Ensure you have the following installed:
- **Java 21** (or latest stable version)
- **Apache Maven 3.6.3** (or later)
- **Velocity Engine** (handled via dependencies)

### Verify Installed Versions
Run the following commands to check your Java and Maven versions:

```sh
  java -version
```

```sh
  mvn -v
```
Expected output:

![image](https://github.com/user-attachments/assets/ab8166c7-0cfb-40fd-8cf0-bcb2e607c12c)


### Generating the Project
How to create the project structure, use Maven’s quickstart archetype:

```sh
  mvn archetype:generate -DgroupId=com.ejemplo.velocity -DartifactId=mi-proyecto-velocity -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
Navigate to the project folder:

```sh
  cd mi-proyecto-velocity
```

### Running the Project and Generating the HTML File
To compile and run the project:

```sh
  mvn clean install
  mvn compile exec:java -Dexec.mainClass="com.ejemplo.velocity.GenerateHtml"
```
Output: An HTML called email_template_velocity file will be generated with the dynamic data applied.

### Running Tests - (optional)
Execute tests with:

```sh
  mvn clean test
```

## Folder Structure

```
mi-proyecto-velocity/
├── src/
│   ├── main/
│   │   ├── java/com/ejemplo/velocity/GenerateHtml.java
│   │   ├── resources/templates/template.vm
│   │   ├── resources/templates/sample_data.json
│   ├── test/
│   │   ├── java/com/ejemplo/velocity/GenerateHtmlTest.java
├── pom.xml
├── README.md
```

## How to Modify & Extend
- **Updating the Email Template**: Modify `src/main/resources/templates/email_template.vm` to update the email structure and styles.
- **Adding New Dynamic Data**: If new placeholders are needed, update `sample_data.json` and modify `GenerateHtml.java` to map the new data.
- **Styling**: Ensure styles are correctly embedded with inline CSS.

## Common Errors & Solutions

### 1. Java Version Issue
**Error:** Project fails due to an outdated Java version.
**Solution:** Upgrade to a stable version:

```sh
  sudo apt update
  apt search openjdk
  sudo apt install openjdk-21-jdk -y
```

### 2. Maven Dependency Issues

**Error:** Build fails due to missing dependencies.
**Solution:** Ensure all dependencies in `pom.xml` are correctly defined. Run:

```sh
  mvn clean install -U
```

## Screenhoots

<img src="https://github.com/user-attachments/assets/b579f634-45c3-4091-bb7b-33724d70d8bd" width="300" alt="Rating Stars" style="display: inline-block"/>
<img src="https://github.com/user-attachments/assets/84b204b9-2ad6-4cac-a77b-6b83a62357c5" width="300" alt="Rating Stars" style="display: inline-block"/>
<img src="https://github.com/user-attachments/assets/d413996f-6923-4bb2-9a90-77535cf419d0" width="300" alt="Rating Stars" style="display: inline-block"/>

<img src="https://github.com/user-attachments/assets/1514dc15-6f1a-4e2c-92ab-3f031a7edcce" width="500" alt="Rating Stars" style="display: inline-block"/>


## Resources:

**Maven Docs:**
- https://maven.apache.org/guides/getting-started/

**Apache Velocity tutorials:**

- https://velocity.apache.org/engine/2.4/user-guide.html

**Maven commands explained:**

- https://maven.apache.org/ref/3.6.3/maven-core/lifecycles.html

**Structure pom.xml example:**

- https://maven.apache.org/pom.html
