Feature: Run Multiple Data
@dilip
Scenario Outline: 1st set of data
#Given Launch the browser and maximize and load the url
And Enter the username as <username>
And Enter the password as <password>
When Click on the login button
Then Verify that login is successful
But Verify condition failed

Examples:
|username|password|
|'DemoCsr'|'crmsfa'|
|'Demo'|'crmsfa'|

@smoke
Scenario Outline: 2nd  set of data
#Given Launch the browser and maximize and load the url
And Enter the username as <username>
And Enter the password as <password>
When Click on the login button
Then Verify that login is successful
But Verify condition failed

Examples:
|username|password|
|'DemoCsr'|'crmsfa'|
|'Demo'|'crmsfa'|
