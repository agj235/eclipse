
Feature: As a valid user when i enter my credentials, I should be able to login


  Scenario: As an editor i should be able to login to the application
    Given I have firefox browser running
    When I i go to the website
    And I enter valid username and password
    |Admin|admin|
    And I click on the login button 
    Then I i should see the logout button 
   When i click on recruitment tab
    And I click on add button
   	And i enter full name
   	|Angel|G|Jimenez|
		And i enter user email
		|abc@email.com|
		Then I click on save button