# Gym Management System

## Overview
The Gym Management System is a Java-based desktop application designed to manage gym memberships, coaches, and related activities. It provides functionality for both gym members and coaches, including user authentication, membership management, coach scheduling, and item purchases.

## Features
- **Login System**: Separate login interfaces for members and coaches.
- **Member Features**:
  - View membership status.
  - Purchase gym-related items.
  - Assign and view coach details.
- **Coach Features**:
  - Add, edit, view, and delete member details.
  - Manage session schedules.
- **Admin Features**:
  - Manage all users and their details.

## Technologies Used
- **Java Swing**: For the graphical user interface.
- **JUnit**: For unit testing.
- **Maven**: For project management and dependency handling.

## How to Run
1. Clone the repository to your local machine.
2. Ensure you have Java 1.7 or higher installed.
3. Use Maven to build the project:
   ```bash
   mvn clean install
   ```
4. Run the `App` class to start the application.

## Project Structure
- **src/main/java/project_poe**: Contains the main application code.
- **src/test/java/project_poe**: Contains unit tests.
- **resources**: Contains images and other assets used in the application.

## Dependencies
- **JUnit 4.11**: For testing purposes.

## Screenshots
- **Login Screen**:
  ![Login Screen](./screenshots/login_screen.png)
- **Member Menu**:
  ![Member Menu](./screenshots/member_menu.png)
- **Coach Menu**:
  ![Coach Menu](./screenshots/coach_menu.png)

## Future Enhancements
- Add database integration for persistent data storage.
- Implement a reporting module for gym analytics.
- Enhance the UI for better user experience.


## Author
Pedro Yazael
