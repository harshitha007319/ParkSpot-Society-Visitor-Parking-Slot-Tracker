# 🚗 ParkSpot – Society Visitor Parking Slot Tracker

## 📌 Project Overview

**ParkSpot** is a Java-based web application developed using **Spring Boot and MySQL** to manage visitor parking slots in a residential society.

The system helps track available parking slots and maintain visitor parking information in an organized way.

## 🎯 Objective

The main objective of ParkSpot is to provide a simple digital system for managing society visitor parking and reducing confusion about available parking slots.

## ✨ Features

* 🚗 View available parking slots
* 🅿️ Manage parking slot details
* 👤 Manage visitor information
* 🔄 Update parking slot availability
* 🗄️ Store information in MySQL database
* 🌐 REST API-based backend
* 📊 Organized parking records

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **MySQL**
* **Maven**
* **Postman**
* **VS Code**
* **Git & GitHub**

## 📂 Project Structure

```text
ParkSpot
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.parkspot
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       └── ParkspotApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## 🗄️ Database

The project uses **MySQL** as the database.

Database name:

```text
parkspot_db
```

The application uses **Spring Data JPA** to communicate with the MySQL database.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/harshitha007319/ParkSpot-Society-Visitor-Parking-Slot-Tracker.git
```

### 2. Open the project

Open the project in **VS Code** or **Spring Tool Suite / Eclipse**.

### 3. Configure MySQL

Create the database:

```sql
CREATE DATABASE parkspot_db;
```

Update the MySQL username and password in:

```text
src/main/resources/application.properties
```

### 4. Run the application

Using Maven:

```bash
mvnw.cmd spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## 🔗 API Testing

The REST APIs can be tested using **Postman**.

Example parking slot response:

```json
[
  {
    "available": true,
    "id": 1,
    "slotNumber": "A1"
  }
]
```

## 🌟 Future Enhancements

* User login and authentication
* Admin dashboard
* Visitor entry and exit tracking
* Parking history
* Search and filter options
* Mobile-friendly interface
* Real-time parking availability

## 🎓 Project Information

**Project Name:** ParkSpot – Society Visitor Parking Slot Tracker

**Student:** HARSHITHA SRI A G

**Department:** II EEE

**College:** Sri Eswar College of Engineering, Coimbatore

## 📜 License

This project is intended for educational and academic purposes.
