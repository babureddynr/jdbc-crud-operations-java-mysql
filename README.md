# 🚀 **JDBC Simple CRUD Operation** 🖥️

Welcome to the **JDBC CRUD Operation Project**! 🎉  
This project demonstrates simple **CRUD (Create, Read, Update, Delete)** operations using **Java** and **MySQL**. It doesn't include any front-end and is purely backend-focused. The operations are performed on a `users` table within a MySQL database.

---

## 🔧 **Technologies Used**:
- **Java** ☕: The backend logic for performing CRUD operations.
- **MySQL** 🛢️: The relational database to store user data.
- **JDBC** 📡: Java Database Connectivity for connecting to the MySQL database.

---

## 📝 **Project Structure**:

- **DatabaseConfig.java**: Responsible for establishing a connection to the MySQL database.
- **User.java**: Represents the `users` table in the database (the entity class).
- **UserDao.java**: Contains all the CRUD operations like Insert, Update, Read, and Delete.
- **Main.java**: The entry point of the application where operations are executed.

---

## 💻 **How to Set Up the Project**:

### 1. **Database Setup**:
First, set up a MySQL database and table. Execute the following queries:

```sql
CREATE DATABASE `crud_db`;

USE `crud_db`;

CREATE TABLE `users` (
    `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `age` INT NOT NULL
);
```

### 2. **Clone the Project**:
Clone this repository to your local machine using the following command:
```bash
git clone https://github.com/your-username/jdbc-crud-operation.git
```

### 3. **Configure Database Connection**:
In the `DatabaseConfig.java` file, ensure that the database URL, username, and password are correctly set up:
```java
private static final String URL = "jdbc:mysql://localhost:3306/crud_db";
private static final String USER = "root"; // Update with your MySQL username
private static final String PASSWORD = "root"; // Update with your MySQL password
```

### 4. **Run the Project**:
Run the **Main.java** file from your IDE or command line:
```bash
javac Main.java
java Main
```

---

## 🔧 **CRUD Operations**:

### 1. **Create**: 
- Adds new user information to the database.
- Command in `UserDao.java`: `createUser(User user)`

### 2. **Read**: 
- Fetches and displays all users from the database.
- Command in `UserDao.java`: `getAllUsers()`

### 3. **Update**: 
- Updates the user information (like name or age).
- Command in `UserDao.java`: `updateUser(User user)`

### 4. **Delete**: 
- Deletes a user based on their `ID`.
- Command in `UserDao.java`: `deleteUser(int userId)`

---

## 🔥 **Project Preview**:
As this is a backend-only project, there is no visual frontend, but you can test CRUD operations using the **Main.java** class by calling appropriate methods to interact with the database.

---

## 🚀 **Improvements to Add**:
- Add more user-related functionalities such as search by name or age.
- Integrate a **web interface** (e.g., using Spring Boot or JSP).
- Add **error handling** and **input validation** for better user experience.

---

## 💡 **Contributing**:
Feel free to raise issues, suggest improvements, or create a pull request! 🚀

---

## 📚 **Acknowledgments**:
- **MySQL** for providing an easy-to-use database management system. 🛠️
- **Java JDBC** for seamless database interaction. 💻

---

## 📬 **Contact**:
- **Email**: your-email@example.com 📧
- **GitHub**: [@your-github](https://github.com/your-username) 💻
- **LinkedIn**: [Your Name](https://www.linkedin.com/in/your-profile) 🔗

---

**Enjoy working with JDBC CRUD operations in Java and MySQL!** 😎
