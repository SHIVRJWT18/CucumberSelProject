Feature: Test Login Functionality of Free Crm Application
Scenario: Verify Successful Signin with valid credentials
Given User launch the Free CRM application
When User verify the current url
Then User enters Username "<username>" and Password "<Password>"
And User click on Login button
And Verify user lands on Free CRM Dashboard Page 

Scenario Outline: Verify Unsuccessful Signin with invalid credentials  
Given User launch the Free CRM application
When User verify the current url
Then User enters Username "<username>" and Password "<Password>"
And User click on Login button
But Verify user lands on Free CRM Login Page 

Examples:
 |Test123|password123|
 |admin|admin1@1|
 |Secretuser|admin123|