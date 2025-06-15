# springboot-todo-api

# 🗂 Task Manager API

A simple RESTful API built with Java and Spring Boot for managing tasks. It supports creating, reading, updating, and deleting tasks.

## Features

- Create new tasks
- View all tasks
- Update existing tasks
- Delete tasks
- RESTful API using Spring Boot
- In-memory H2 database for development
- CORS enabled for frontend integration

---

## Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

##  Project Structure

```
src/main/java/com/gleidson/taskmanager
├── controller
├── service
├── model
├── repository
└── TaskManagerApplication.java
```

---

## 🛠 Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/gleidsonguilhem/task-manager-api.git
cd task-manager-api
```

### 2. Build and run the application

Using Maven:
```bash
./mvnw spring-boot:run
```

Or via your IDE (e.g., IntelliJ): Run the TaskManagerApplication.java class

### 3. Access the API

The application will run at:
```
http://localhost:8080
```

### 4. Access H2 Console (for dev)

```
http://localhost:8080/h2-console
```
JDBC URL: `jdbc:h2:mem:testdb`  
Username: `sa`  
Password: (leave blank)

---

## API Endpoints

| Method | Endpoint       | Description           |
|--------|----------------|-----------------------|
| GET    | /tasks         | List all tasks        |
| POST   | /tasks         | Create a new task     |
| GET    | /tasks/{id}    | Get task by ID        |
| PUT    | /tasks/{id}    | Update task by ID     |
| DELETE | /tasks/{id}    | Delete task by ID     |

---

## CORS Support

Cross-Origin requests are enabled for development via:
```java
@CrossOrigin(origins = "*")
```

---

## 📦 Deployment

You can deploy this API on platforms like Render, Railway, or Heroku.

---

## License

This project is licensed under the MIT License — feel free to use and adapt!

---

## Author

Gleidson Guilhem  
[LinkedIn](https://www.linkedin.com/in/gleidsonguilhem/) • [Portfolio](https://gleidsonguilhem.github.io/gleidson-portfolio/) • [GitHub](https://github.com/gleidsonguilhem)
