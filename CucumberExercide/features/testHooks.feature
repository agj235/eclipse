# Hooks

Feature: As a valid user when i enter my credentials, I should be able to login

@First
  Scenario: As an editor i should be able to login to the application
    
    And I enter valid username and password
     |Admin|admin|
  @Second   
     Scenario: As an editor i should be able to login to the application
    
    And I enter valid username and password
     |administrator|admin|