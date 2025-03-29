# Customer-Service

Customer-Service is a customer management project developed with Spring Boot and Eureka, designed to facilitate the registration and management of employee data in a distributed system using microservices.

## :clipboard: Requirements

> **Note:**  
> To run this project, you need:
>
>- **Java 17** or a higher version.
>- **MySQL** with an active database.
>- **Spring Boot** (version 3.4.4).
>- The `Schema-MySql.sql` file located in `src/main/resources` contains the necessary operations to create the schema and the table in the database.

## :gear: Database Configuration

1. Create a MySQL database to store employee data.
2. If you don't have the `application.properties` file in the `src/main/resources` directory, create it and set your database username and password. Refer to the `application-example.properties` file located in the same directory as an example.

    ```properties
    spring.datasource.username=customer
    spring.datasource.password=customer2025
    ```

## :gear: Port Configuration

1. In the `application.properties` file, you can set the port in which you want to run your microservice. If you do not configure a port, the microservice will automatically run on port 9092.

    ```properties
    server.port=9092
    ```

## :gear: Eureka Service Discovery Configuration

1. **Eureka Service Discovery** is a server that helps discover and register microservices in a distributed system. You need to download the discovery service **[here](https://github.com/AndresMaldonado200338/Eureka-Service-Discovery)**.
2. Follow the steps to run **Eureka Service Discovery**, ensuring the port it is deployed on matches the one you have in the `eureka.client.service-url.defaultZone` URL of your `application.properties` file in this project.

    In **Eureka Service Discovery**:
    ```properties
    server.port=8761
    ```

    In this project:
    ```properties
    eureka.client.service-url.defaultZone=http://localhost:8761/eureka
    ```

## :heavy_check_mark: Running the Project

1. Download the **Eureka Service Discovery** and this project, ensuring they are located in appropriate places.
2. Open both projects in your preferred IDE.
3. Run the main file of **Eureka** `EurekaApplication.java` located at `src/main/java/edu/uptc/swii/eureka`.
4. Run the main file of **Customer Service** `CustomerserviceApplication.java` located at `src/main/java/edu/uptc/swii/customerservice`.

**Eureka Service Discovery** will run at the URL `http://localhost:PORT`, where `PORT` is the value you configured earlier in the `application.properties` file.

**Customer Service** will be found in the Eureka dashboard under the **“Instances currently registered with Eureka”** section or by accessing it directly at `http://localhost:PORT`, where `PORT` is the value configured in the `application.properties` file.

## :handshake: Contributors

This project was created by:

### - Juan David Ochoa
[![Github](https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white)](https://github.com/JuanDavid0)  
[![LinkedIn](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/juan-david-ochoa-pinilla/)

### - William Cely
[![Github](https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white)](https://github.com/WilliamC111)  
[![LinkedIn](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/williamcelyl%C3%B3pez/)

### - Andrés Maldonado
[![Github](https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white)](https://github.com/AndresMaldonado200338)  
[![LinkedIn](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/amaldonados/)
