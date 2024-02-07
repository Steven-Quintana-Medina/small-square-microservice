<br />
<div align="center">
<h3 align="center">SMALL SQUARE MICROSERVICE</h3>

</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
* ![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)

## About the Project

This is a microservice in charge of centralizing orders from a small square that has different restaurants, each with a particular menu.

<!-- GETTING STARTED -->
## Getting Started

To view how the project works go to https://small-square-app.onrender.com/swagger-ui/index.html 

To get a local copy up and running, follow these steps.

### Prerequisites

* JDK 17 [https://jdk.java.net/java-se-ri/17](https://jdk.java.net/java-se-ri/17)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)
* MySQL [https://dev.mysql.com/downloads/installer/](https://dev.mysql.com/downloads/installer/)

### Recommended Tools
* IntelliJ Community [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Postman [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

### Installation
1. Clone the repository
2. Open project
3. Create a new database in MySQL
4. update environment variables
   - DATABASE_URL=;
   - DATABASE_USERNAME=;
   - DATABASE_PASSWORD=;
   - SERVER_PORT=;
   - EXPIRE_DAYS_SECURITY=;
   - KEYSECRET_SECURITY=;
   - URL_MESSENGER_MICROSERVICE=;
   - URL_USER_MICROSERVICE=;
   - URL_TRACEABILITY_MICROSERVICE=;

note: You must send the bearer token to be able to use some functionalities of this microservice

<!-- USAGE -->
## Usage
1. Right-click the class PowerUpApplication and choose Run
2. Open [http://localhost:8091/swagger-ui/index.html](http://localhost:8091/swagger-ui/index.html) in your web browser

<!-- ROADMAP -->
## Tests
- Right-click the test folder and choose Run tests with coverage