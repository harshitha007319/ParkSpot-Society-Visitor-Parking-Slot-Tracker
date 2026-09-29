# ParkSpot-Society-Visitor-Parking-Slot-Tracker
# ParkSpot – Society Visitor Parking Slot Tracker

ParkSpot is a Spring Boot and MySQL-based application designed to manage visitor parking slots in residential societies. It helps track parking availability, manage visitor details, and maintain parking records digitally.

## 📌 Project Overview

In residential societies, visitor parking spaces are often limited. Manual tracking can lead to confusion about which slots are available or occupied.

ParkSpot provides a simple backend system to manage parking slots and visitor information using REST APIs and a MySQL database.

## ✨ Features

* View parking slot details
* Check parking slot availability
* Add and manage visitor details
* Manage parking slot information
* Store data in MySQL
* REST API-based backend
* Easy database management using Spring Data JPA

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **MySQL**
* **Maven**
* **REST API**
* **Postman**
* **Git & GitHub**
* **VS Code**

## 📂 Project Structure

```text
parkspot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/parkspot/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       └── ParkspotApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## 🗄️ Database

The project uses **MySQL** to store parking and visitor information.

Example database:

```text
parkspot_db
```

Spring Data JPA is used to connect the Java application with the MySQL database.

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Open the project

Open the project in **VS Code** or another Java IDE.

### 3. Configure MySQL

Create the database:

```sql
CREATE DATABASE parkspot_db;
```

Update the MySQL username, password, and database details in:

```text
src/main/resources/application.properties
```

### 4. Run the application

Using Maven Wrapper:

**Windows:**

```powershell
.\mvnw.cmd spring-boot:run
```

The application will start on the configured Spring Boot port.

## 🔗 API

The application provides REST APIs for managing parking slots and visitors.

Example parking slot endpoint:

```text
GET /api/parking-slots
```

The APIs can be tested using **Postman**.

## 🎯 Project Objective

The objective of ParkSpot is to provide a simple digital solution for managing visitor parking in residential societies and to demonstrate practical implementation of Java, Spring Boot, REST APIs, MySQL, and JPA.

## 🔮 Future Enhancements

* User login and authentication
* Admin dashboard
* Frontend interface
* Visitor check-in and check-out
* Parking history
* Search and filtering
* Notifications for available parking slots
* Role-based access control

## 👩‍💻 Developer

**HARSHITHA SRI A G**

**II EEE**
**Sri Eswar College of Engineering, Coimbatore**

---

⭐ If you find this project useful, feel free to explore the repository and its featu
