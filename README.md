# Venue Management Backend (Spring Boot)

This is the backend service for the Venue Management System, built using **Spring Boot**, **JPA**, and **PostgrSQL**. It provides APIs for managing venues, events, and addresses.

## 🚀 Features
- 🏢 Venue Management (Create, Update, Delete)
- 📍 Address Handling for Venues
- 🔐 User Authentication 
- 📡 RESTful APIs using Spring Boot

## 🛠 Tech Stack
- **Backend:** Java, Spring Boot, Spring Data JPA
- **Database:** PostgreSQL  
- **Security:** Spring Security & JWT

## Project Structure
src
├── main
│   ├── java
│   │   └── com
│   │       └── venue
│   │           ├── controller     # API Controllers handling requests
│   │           ├── dto            # Data Transfer Objects for request/response bodies
│   │           ├── entity         # Entity Models representing database tables
│   │           ├── mapper         # Mapper Classes for converting between DTOs and entities
│   │           ├── repository     # JPA Repositories for data access layer
│   │           └── service        # Service Layer containing business logic
│   └── resources
│       ├── application.properties # Configuration Properties (DB settings, etc.)
│       └── data.sql               # Sample Data for testing purposes
└── test                           # Unit and Integration Tests

Method	Endpoint	Description
GET	/venues	Get all venues
POST	/venues	Create a new venue
GET	/events	List all events
POST	/events	Add a new event

GET DATA
![image](https://github.com/user-attachments/assets/c1e643c8-f5d5-4f21-a525-d30f72c6039a)

POST DATA
![image](https://github.com/user-attachments/assets/2edd81c8-5e90-490d-aa84-a47976072a6f)

UPDATA DATA
![image](https://github.com/user-attachments/assets/931196eb-66cd-4f92-b23b-99fbf2855251)

DELETE DATA
![image](https://github.com/user-attachments/assets/fff8ba29-c8df-4ac4-917b-ec602fb2e668)


