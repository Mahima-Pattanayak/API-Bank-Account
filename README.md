# API-Bank-Account
<p>This is my first api for managing bank account.</p>
<p> Hope you like it!</p>
<p> To run the API run BankApiApplication.java</p>
<ol><li>
  Create an account <ul><li>
    POST http://localhost:8080/api/accounts
Content-Type: application/json

{
  "accountNumber": "123456789",
  "accountHolderName": "John Doe",
  "balance": 1000.0
}
  </li></ul>
  <li> Update an account
    <ul><li>PUT http://localhost:8080/api/accounts/1
Content-Type: application/json

{
  "accountNumber": "987654321",
  "accountHolderName": "Jane Doe",
  "balance": 2000.0
}</li></ul>
  </li>
  <li>
    Get all account
    <ul><li>GET http://localhost:8080/api/accounts </li></ul>
  </li>
  <li>
    Delete an account 
    <ul><li>DELETE http://localhost:8080/api/accounts/1</li></ul>
  </li>
</li>
</ol>
