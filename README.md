# Student Management System

This project is a **Student Management System** built using 
**Spring Boot** and **MySQL**. 
It provides a set of RESTful APIs to perform 
CRUD operations (Create, Read, Update, Delete) on student records. 
The application is tested using **Postman**.

---
## Features

- **Add Student**: Add a new student to the database.
- **Retrieve All Students**: Fetch the list of all students.
- **Update Student**: Update details of an existing student.
- **Delete Student**: Remove a student record.
---
## Technologies Used

- **Backend**: Spring Boot,java
- **Database**: MySQL
- **API Testing Tool**: Postman
---
## Project Structure
```
src/main/java/com/lbs/studentmanagementapp
├── controller       # Contains REST controllers
├── dto              # Data Transfer Objects
├── entity           # Entity classes mapped to database tables
├── repo             # Repository interfaces for database operations
├── service          # Service interfaces and implementations
└── StudentManagementAppApplication.java  # Main application file
```
---
## Setup Instructions
### Prerequisites
1. **Java Development Kit (JDK)**
   - Version 19 or higher.
2. **Maven**
   - Ensure Maven is installed for dependency management.
3. **MySQL**
   - Install and configure MySQL server 8.0.40.
4. **Postman**
   - Use Postman to test APIs.

### Steps to Run
1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/student-management-system.git
   cd student-management-system
   ```
2. **Configure MySQL Database**

   - Open the `application.properties` file in `src/main/resources`.
   - Update the database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/student_db
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     ```
3. **Build and Run the Project**

   - Use Maven to build and run the project:
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```
4. **Test APIs**

   - Open Postman and use the following endpoints to test the application:
     | HTTP Method | Endpoint               | Description                |
     | ----------- | ---------------------- | -------------------------- |
     | POST        | `/api/students/add`    | Add a new student          |
     | GET         | `/api/students/all`    | Get all students           |
     | PUT         | `/api/students/update` | Update an existing student |
     | DELETE      | `/api/students/delete` | Delete a student by ID     |
---
## Example API Payloads
### Add Student
**Endpoint:** `/api/students/add`
**Payload:**
```json
{
    "studentname": "John Doe",
    "address": "123 Main St",
    "phone": "1234567890"
}
```
### Update Student
**Endpoint:** `/api/students/update`
**Payload:**
```json
{
    "studentid": 1,
    "studentname": "John Updated",
    "address": "456 Updated St",
    "phone": "9876543210"
}
```
---
## Contact

If you have any questions or suggestions, feel free to reach out:

- GitHub: (https://github.com/Rahulcodes0809)
- Email: (mailto\:Kamblerahul0809@gmail.com)




