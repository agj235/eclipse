Feature: As a valid user when i enter my credentials, I should be able to login


  Scenario Outline: As an editor i should be able to login to the application
    Given I have firefox browser running
    When I i go to the website
    And I enter valid "<username>" and "<password>"
    And i quit browser
    Examples:
    |username|password|
    |Admin|admin|
    |editor|welcome1|
     |editor|welcome1|
     
 
    
   
	