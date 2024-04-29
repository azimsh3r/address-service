### Address Microservice README

#### Introduction
This microservice is designed to manage addresses related to employees. It is built using Spring Boot and functions as a discovery client with Eureka for service discovery.

#### Functionality
The microservice provides the following functionalities:

1. **Address Storage**: Addresses of employees are stored in a relational database using JPA (Java Persistence API).
2. **RESTful API**: Exposes a RESTful API to interact with the address data.
3. **Exception Handling**: Includes exception handling for scenarios like address not found.

#### Components

##### 1. Address Model
- **Package:** `com.example.Address.models`
- **Description:** Defines the structure of the Address entity, including fields such as lane1, lane2, zip code, state, and employee ID.

##### 2. Address Controller
- **Package:** `com.example.Address.controllers`
- **Description:** Handles HTTP requests related to addresses. Exposes endpoints to retrieve address data by employee ID. Utilizes DTOs (Data Transfer Objects) to map between the entity and the data transferred over the network.

##### 3. Address Service
- **Package:** `com.example.Address.services`
- **Description:** Provides business logic for address-related operations. Implements methods to fetch address data from the repository.

##### 4. Address Repository
- **Package:** `com.example.Address.repositories`
- **Description:** Interfaces with the database using Spring Data JPA. Includes custom query methods to find addresses by employee ID.

#### Setup Instructions
To set up and run the Address Microservice:

1. **Clone the Repository:** Clone the repository containing the microservice code.
2. **Build the Project:** Build the project using Maven or Gradle.
3. **Configure Database:** Configure the database connection properties in the `application.properties` file.
4. **Run the Application:** Start the Spring Boot application.
5. **Access the API:** Access the RESTful API endpoints using appropriate HTTP requests.

#### Dependencies
- **Spring Boot**: Framework for creating stand-alone, production-grade Spring-based applications.
- **Spring Data JPA**: Simplifies the implementation of data access layers.
- **Jakarta Persistence**: Provides a set of classes and interfaces for the Jakarta Persistence API.
- **ModelMapper**: Facilitates object mapping between DTOs and entities.
- **Eureka Client**: Integrates with the Eureka server for service discovery.

#### Contributing
Contributions to the Address Microservice are welcome. Please fork the repository, make changes, and submit a pull request.

#### Contact
For any inquiries or support regarding the Address Microservice, please contact [insert contact information].

#### License
This project is licensed under [insert license]. See the LICENSE file for more details.
