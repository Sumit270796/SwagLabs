Feature: Login feature


Background:
          Given  User launch browser
           When   User enter url "https://www.saucedemo.com/v1/"



Scenario: User login with valid credential
And    User enter username as "standard_user" and password  as "secret_sauce"
And    User click on login button
Then   User navigate to the page pageTitle  should be "Swag Labs"
And    User click on open menu button
And    User click on logout link
And    User close browser

Scenario Outline: Unsuccessfull  login with invalid credential
When   User enter invalid credential username as "<username>" and password as "<password>"
And    User click on login button 
And    User should see an error message "Epic sadface: Username and password do not match any user in this service"
And    User close browser 

Examples:
|username       |password|
|standard_user  |secret   |
|standard       |secret_sauce|
|standard       |secret      |










