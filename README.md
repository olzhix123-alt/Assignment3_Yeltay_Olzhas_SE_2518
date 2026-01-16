# Restaurant Ordering System API (Assignment 3)
## 1. Project Overview
   This project is a Java-based API for a Restaurant Ordering System. Its purpose is to manage a menu of food and drink items using a multi-layer architecture and a PostgreSQL database.

## 2. OOP Design Documentation
   This API strictly follows the Object-Oriented Programming requirements:

Abstract Class (MenuItem): Acts as the base entity for the menu, containing shared fields like id, name, and price. It defines abstract methods getType() and calculateTax().

Subclasses (FoodItem, DrinkItem): These classes extend MenuItem and override the abstract methods to provide specific logic.

Polymorphism: Demonstrated by iterating through a List<MenuItem> and calling calculateTax(), where each object responds according to its specific type.

Interfaces:

Validatable: Defines the validate() method to enforce business rules.

PricedItem: Defines getPrice() to ensure price consistency.

Composition: The Order class contains a List<MenuItem>, demonstrating a "has-a" relationship.

Encapsulation: All fields are private, with access controlled via public getters and setters.

## 3. Database Description
   The system interacts with a PostgreSQL database using JDBC:

Schema:

id: SERIAL PRIMARY KEY.

name: VARCHAR (Not Null).

price: DOUBLE PRECISION (Constraint: Positive value).

type: VARCHAR (Distinguishes between Food and Drink).

Sample SQL Inserts:
SQL
INSERT INTO menu_items (name, price, type) VALUES ('Pizza', 2500.0, 'Food');
INSERT INTO menu_items (name, price, type) VALUES ('Coffee', 800.0, 'Drink');
## 4. Multi-Layer Architecture:
   Model: Core entities and business logic.

Repository: JDBC-based data access layer using PreparedStatements.

Service: Handles validation and bridges the controller and repository.

Controller (Main): Exposes operations and prints results to the CLI.

Exception: Custom hierarchy including InvalidInputException.

## 5. Instructions to Run
   Set up the PostgreSQL database using the schema provided above.

Add the PostgreSQL JDBC Driver to your project classpath.

Configure DatabaseConnection.java with your credentials.

Run Main.java.

## 6. Reflection
   Learned: Implementing the multi-layer architecture made the code much cleaner and easier to maintain.

Challenges: Configuring JDBC and handling SQLExceptions correctly across different layers.
