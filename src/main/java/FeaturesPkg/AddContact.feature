Feature: Verify Add Contact Functionality in Free CRM application
Scenario Outline: Test to Add Contact to the Free CRM
Given User launch the FreeCRm application
When User verify the current url
# Without Use Example (Line 7 works only for Line 6 only)
Then User enters Username  and Password 
|dinapadshiv1811@gmail.com | Password@123|
And User click on Login button
And User lands on Free CRM Dashboard Page 
When User click on Add Contact in the left Menu
Then User redirect to Create New Contact Page
When User enters FirstName "<firstname>" and Lastname "<lastname>"
Then User enters Email "<email>" and select Category "<category>"
And User select Status "<status>" and  select Social channels "<channel>"
And User enters Address "<address>" and select Country "<country>" and Mobile No "<mobile no>"
Then User clicks on Save button 
Then Verify Conatct added on the DashBoard Page 

