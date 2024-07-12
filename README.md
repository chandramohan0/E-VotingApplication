# E-Voting Application

The E-Voting System Application is an online platform designed to conduct elections electronically. It allows users to create elections, add choices to elections, register as voters, cast votes, and retrieve election results. This application is built using Spring Boot, Spring Data, JPA, and JPA Queries, H2 database.

## Features

- Create elections with a unique title.
- Add choices to an election.
- Register users as voters with unique usernames.
- Cast votes for a specific election and election choice.
- Retrieve election results, including the total votes and the winning candidate.

## Project Structure

- `entities`: Contains the entity classes representing the database tables.
- `repositories`: Contains the repository interfaces for database operations.
- `services`: Contains the service classes to handle business logic.
- `controllers`: Contains the REST API endpoints.

## Flowchart
<img width="879" alt="Flowchart" src="https://github.com/user-attachments/assets/82d11aa1-9632-479f-994c-be62168da895">



## Entities

1. **Election**
   - `id`: Long
   - `name`: String (unique)

2. **ElectionChoice**
   - `id`: Long
   - `name`: String
   - `election`: Election (Many-to-One relationship with Election entity)

3. **User**
   - `id`: Long
   - `name`: String (unique)

4. **Vote**
   - `id`: Long
   - `user`: User (One-to-One relationship with User entity)
   - `election`: Election (Many-to-One relationship with Election entity)
   - `electionChoice`: ElectionChoice (Many-to-One relationship with ElectionChoice entity)

## API Endpoints

### Election Endpoints

- **GET** `/get/elections`: It retrieves the list of all elections.
- **POST** `/add/election` (@RequestBody Election election): It creates a new election.

### ElectionChoice Endpoints

- **POST** `/add/electionChoice` (@RequestBody ElectionChoice electionChoice): It adds an election choice.
- **GET** `/get/electionChoices`: It fetches the list of all election choices from the database.
- **POST** `/count/election/choices` (@RequestBody Election election): It retrieves the list of all choices for the given election.

### User Endpoints

- **POST** `/add/user` (@RequestBody User user): It creates a new user into the database.
- **GET** `/get/users`: It fetches the list of all users from the database.

### Vote Endpoints

- **GET** `/get/votes`: It fetches the list of all votes from the database.
- **POST** `/add/vote` (@RequestBody Vote vote): It registers a new vote into the database.
- **GET** `/count/votes`: It fetches the count of total votes from the database.
- **POST** `/count/election/votes` (@RequestBody Election election): It returns the count of total votes by election in long.

### Results Endpoints

- **POST** `/winner/election` (@RequestBody Election election): It retrieves the ElectionChoice for a specific election as the winner.

## Testing

Test the application using Postman or a similar tool. Ensure that the following functionalities work correctly:

- Creating an election.
- Adding election choices.
- Registering a user.
- Casting a vote.
- Retrieving election results.

## Running the Application

1. Clone the repository.
2. Set up the MySQL database and update the `application.properties` file with the database credentials.
3. Build and run the application using your preferred IDE.
4. Use Postman to interact with the API endpoints.


