# Training Center Registry - Spring Boot MVP

This project is a **Minimum Viable Product (MVP)** for a **Government-funded Training Center Registry**. It is built using **Spring Boot** and provides APIs to create and retrieve training center information. The application adheres to best practices, including validation, exception handling, and clean code architecture.

---

## Table of Contents

1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [API Documentation](#api-documentation)
4. [Setup and Installation](#setup-and-installation)
5. [Project Structure](#project-structure)
6. [Validation Rules](#validation-rules)
7. [Error Handling](#error-handling)
8. [Testing the APIs](#testing-the-apis)
9. [Future Enhancements](#future-enhancements)
10. [Contributing](#contributing)
11. [License](#license)

---

## Features

- **Create Training Center**: A POST API to create and save a new training center with mandatory and optional fields.
- **Get All Training Centers**: A GET API to retrieve a list of all saved training centers.
- **Validation**: Comprehensive validation for all fields, including mandatory checks, email validation, phone number validation, and more.
- **Exception Handling**: Custom exception handling to return meaningful error messages for invalid requests.
- **Database Integration**: Uses **H2 in-memory database** for simplicity, with **Spring Data JPA** for database interactions.
- **Scalable Architecture**: Follows a clean and modular project structure for easy scalability.

---

## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, Hibernate
- **Database**: H2 (in-memory database)
- **Validation**: Bean Validation (Hibernate Validator)
- **Build Tool**: Maven
- **API Testing**: Postman, cURL
- **Other Libraries**: Lombok (for reducing boilerplate code)

---

## API Documentation

### 1. **Create a Training Center**

- **Endpoint**: `POST /api/training-centers`
- **Description**: Creates a new training center with the provided details.
- **Request Body**: JSON object with fields like `centerName`, `centerCode`, `address`, `studentCapacity`, `coursesOffered`, `contactEmail`, and `contactPhone`.
- **Response**: Returns the saved training center details on success or validation errors on failure.

---

### 2. **Get All Training Centers**

- **Endpoint**: `GET /api/training-centers`
- **Description**: Retrieves a list of all saved training centers.
- **Response**: Returns a list of training centers or an empty list if no centers are saved.

---

## Setup and Installation

### Prerequisites

- Java 17 or higher
- Maven 3.x
- IDE (IntelliJ IDEA, Eclipse, or any preferred IDE)

### Steps to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/training-center-registry.git
   cd training-center-registry


### Validation Rules
- **centerName:** Mandatory, max 40 characters.

- **centerCode:** Mandatory, exactly 12 alphanumeric characters.

- **address:** Mandatory, with nested validations for detailedAddress, city, state, and pincode.

- **studentCapacity:** Minimum value of 1.

- **contactEmail:** Optional, but must be a valid email if provided.

- **contactPhone:** Mandatory, 10-digit number.
### Error Handling
- Custom exception handling is implemented to return detailed validation error messages in the response.
### Contact
For any questions or feedback, please reach out to Saqib Rashid Bhat. 
Thank you for using the Training Center Registry project! 🚀

---
### Testing the APIs
**Using Postman**
1. Create a Training Center:

- Method: POST

- URL: http://localhost:8080/api/training-centers

- Headers: Content-Type: application/json

- Body:
  ```bash {
  "centerName": "Tech Training Institute",
  "centerCode": "TECH12345678",
  "address": {
    "detailedAddress": "123 Main Street",
    "city": "Bangalore",
    "state": "Karnataka",
    "pincode": "560001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python", "Data Science"],
  "contactEmail": "info@techtraining.com",
  "contactPhone": "9876543210"
}
## Expected Response:
 ```bash
{
  "id": 1,
  "centerName": "Tech Training Institute",
  "centerCode": "TECH12345678",
  "address": {
    "detailedAddress": "123 Main Street",
    "city": "Bangalore",
    "state": "Karnataka",
    "pincode": "560001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python", "Data Science"],
  "createdOn": 1698765432100,
  "contactEmail": "info@techtraining.com",
  "contactPhone": "9876543210"
}
2 Get All Training Centers:
- Method: GET

- URL: http://localhost:8080/api/training-centers

- Expected Response:
 ```bash
[
  {
    "id": 1,
    "centerName": "Tech Training Institute",
    "centerCode": "TECH12345678",
    "address": {
      "detailedAddress": "123 Main Street",
      "city": "Bangalore",
      "state": "Karnataka",
      "pincode": "560001"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Java", "Python", "Data Science"],
    "createdOn": 1698765432100,
    "contactEmail": "info@techtraining.com",
    "contactPhone": "9876543210"
  }
]

