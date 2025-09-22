# BankEntity-API

This is a simple Spring Boot REST API that manages bank accounts.  
It was built for a coding challenge and covers the basics of creating an account, updating it, fetching accounts, and making sure duplicate account holder names are not allowed.

---

## How to run the project

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/bank-entity-api.git
   cd bank-entity-api
2. Run it with Maven
   ./mvnw spring-boot:run
   or open it in IntelliJ and run the main class.

3. The app will start on http://localhost:8080

 ---


## API Endpoints
POST /api/v1/accounts → create a new account
GET /api/v1/accounts/{id} → get account by ID
GET /api/v1/accounts → get all accounts
PUT /api/v1/accounts/{id} → update account

Example of creating a new account (POST):
{
"accountHolderName": "Ntando Magana",
"accountBalance": 550.53,
"accountType": "SAVINGS"
}

## Database
The app uses H2 database.
Console: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:file:./data/BankEntity-API
Username: sa
Password: (leave blank)

## Notes
If you try to create an account with the same name twice, it will throw an error because names must be unique.
The database is stored in a file (./data/BankEntity-API), so data won’t disappear each time you restart the app.