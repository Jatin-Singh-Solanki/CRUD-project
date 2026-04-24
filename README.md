# CRUD Application (Full Stack)

A clean and scalable **full-stack CRUD application** built using **Angular 21** (frontend) and **Java 25 + Spring Boot 4** (backend). The application enables users to **create, view, update, and delete records** with a simple and responsive UI.

---

## Tech Stack

**Backend:**
Java 25, Spring Boot 4, Spring Data JPA, H2 Database, Maven

**Frontend:**
Angular 21, TypeScript, HTML, CSS

---

## Features

* Create new users
* View users in structured list
* Update existing records
* Delete users
* Add notes for each user
* Instant UI updates after actions
* Responsive UI

---

## Project Structure

```
backend/
  controller/
  service/
  repository/
  entity/
  dto/
  config/

frontend/
  core/services/
  features/users/
  shared/models/
```

---

## Architecture

This application follows a **client-server architecture**.

**Frontend (Angular):**

* Handles UI rendering
* Manages user interactions
* Calls backend APIs

**Backend (Spring Boot):**

* Exposes REST APIs
* Handles business logic
* Manages database operations

The backend follows a **layered architecture**:
Controller → Service → Repository → Database

---

## API Endpoints

```
GET     /api/users
GET     /api/users/{id}
POST    /api/users
PUT     /api/users/{id}
DELETE  /api/users/{id}
```

---

## How to Run

### Prerequisites

* Java 25
* Maven
* Node.js
* npm

---

### Run Backend

```
cd backend
mvn spring-boot:run
```

Runs at: http://localhost:8080

---

### Run Frontend

```
cd frontend
npm install
npm start
```

Runs at: http://localhost:4200

---

## Design Decisions

* **Spring Boot** → Simplifies REST API development
* **Angular** → Strong structure and scalability
* **H2 Database** → Easy local setup, no external dependency

---

## Limitations

* In-memory database (data resets on restart)
* No authentication/authorization
* No pagination, filtering, or search

---

## Future Improvements

* Add **JWT Authentication**
* Use **MySQL/PostgreSQL**
* Implement **search, filter, pagination**
* Add **unit & integration tests**
* Dockerize the application

---

## Author

Jatin Singh Solanki
