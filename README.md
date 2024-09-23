# SpringAPI: User Management REST API

## Overview
This is a basic Spring Boot REST API that handles user data. It allows clients to retrieve user information by ID. The project demonstrates the use of Spring’s `@RestController`, service layer architecture, and dependency injection.

## Project Structure
The project has three main components:
1. **Model** (`User`): Represents the user entity.
2. **Service** (`UserService`): Contains business logic for retrieving users.
3. **Controller** (`UserController`): Exposes the REST API to retrieve user data.

### `User`
The `User` class represents a user entity with the following fields:
- `id`: Unique identifier for the user.
- `name`: Name of the user.
- `age`: Age of the user.
- `email`: Email address of the user.

### `UserService`
This class contains a list of predefined users and provides a method to retrieve a user by their `id`. It uses an in-memory list of `User` objects.

- **`getUser(Integer id)`**: Returns an `Optional<User>` that contains the user with the specified `id` if found, otherwise an empty `Optional`.

### `UserController`
This class exposes a REST API to retrieve users.

- **Endpoint**: `/users`
  - **Method**: `GET`
  - **Parameters**: `id` (Integer) - The ID of the user to retrieve.
  - **Response**: The `User` object corresponding to the provided ID or `null` if not found.

Example request:
```bash
GET /users?id=1
```

Example response:
```json
{
  "id": 1,
  "name": "siddhu",
  "age": 18,
  "email": "siddhu@gmail.com"
}
```

## How to Run

### Prerequisites
- Java 8 or higher
- Maven or Gradle
- Spring Boot

### Steps
1. Clone this repository:
   ```bash
   git clone <repo-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd SpringAPI
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the API at:
   ```
   http://localhost:8080/users?id=<user_id>
   ```

### Example:
To retrieve the user with ID `1`, send a GET request to:
```
http://localhost:8080/users?id=1
```

## Predefined Users
The following users are available in the in-memory database:
1. Siddhu (18 years old, siddhu@gmail.com)
2. Harry (21 years old, harry@sidemen.com)
3. Josher (11 years old, josher@sidemen.com)
4. Miniminter (17 years old, miniminter@outlook.com)
5. Vik (28 years old, vikstar@sidemen.com)
6. JJ (25 years old, jjksi@sidemen.com)

## License
This project is open-source. You can modify and use it as needed.
