Feature: Create Lead

Scenario Outline: Click on link
#Given Launch the browser and maximize and load the url
And Enter the username as <username>
And Enter the password as <password>
When Click on the login button
Then Verify that login is successful
Given Click On Crmsfa And Click on Leads
And Click on Create Leads link
And Enter Company Name as <companyname>
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
Then Click on Create Leads button


Examples:
|username|password|companyname|firstname|lastname|
|'DemoCsr'|'crmsfa'|Testleaf|Dilip|kumar|

