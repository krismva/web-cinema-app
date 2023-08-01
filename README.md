# Cinema-app
___
## Description
Spring web application project is the operation of a cinema.
___
## Functions
- register and log in as a user/administrator;
#### Registered as USER role:
- find movies and cinema halls
- find available movie sessions
- create shopping cart
- add tickets to shopping cart
- view shopping cart
- make an order
- view order history
#### Registered as ADMIN role:
- create and find movies and cinema halls
- create and find available movie sessions
- find user by email
___
## Project structure
- src/main/java/cinema/spring - Contains the Java source code for the project, organized according to a layered architecture.
    - ***config*** - classes for configuration of application operation
    - ***controller*** - Contains the controllers that handle incoming HTTP requests and delegate to the appropriate service layer.
    - ***dao*** - Contains the data access objects that handle interactions with the database.
    - ***dto*** - Data Transfer Objects are representing communication objects for customer requests and responses.
    - ***exception*** - custom exception.
    - ***lib*** - contains custom annotations and logic for email and password validation.
    - ***model*** - Contains the domain model objects representing the entities in the system.
    - ***service*** - Contains the business logic and serves as an intermediary between the controller and dao layers.
    - ***util*** - utility class used to determine DateTime pattern.
    - ***src/main/resources*** - Contains the application configuration files.
    - ***pom.xml*** - The Maven project configuration file.
___
## Technologies
- JDK 17
- Maven
- MySQL 8.0.22
- TomCat 9.0.xx
- Spring security 5.6.10
- Spring Web 5.3.20
- Spring 5.3.20
- Hibernate 5.6.14.Final
- Hibernate validator 6.1.6.Final
___
## How to run
1. Ensure that you have JDK, Maven, and MySQL installed on your system.
2. Clone the project from GitHub
3. Update the database configuration in db.properties with your own MySQL credentials.
4. Run the Maven command mvn clean package to make sure everything is fine.
5. Configure TomCat for this project
6. Access the application at http://localhost:8080 in your web browser.
7. You can use password and login from DataInitializer
