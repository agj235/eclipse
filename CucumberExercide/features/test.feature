
Feature: As a valid user when i enter my credentials, i should be able to Login
  @Sprint1
  @Chrome
	Scenario: As an editor i should be able to login to the application
    Given I have a chrome browser running 
    When i go to the website 
    And I enter valid username
    And I enter valid password
    When I click on the login button
    Then I should see the logout link
    
    
  
  	Scenario: As an Administrator i should be able to add new candidate
    Given I have a firefox browser running 
    When i go to the website 
    And I enter valid username"Admin"
    And I enter valid password "admin"
    When I click on the login button
  	When i click on recruitment tab
    And I click on add button
    And i enter Full name
    And i enter email
    And i enter contact number
    Then I click on save button

    Scenario: As an Administrator i should be able to add employee
 	 Given I have a chrome browser running 
    When i go to the website 
    And I enter valid username
    And I enter valid password
    When I click on the login button
    When i click on PIM button 
    And I click add employee
    And i enter new Full name
    Then I click on save button
    
    
    
  

 