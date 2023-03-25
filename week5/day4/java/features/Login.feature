Feature: Login To LeafTap Application

#Background: 
#Given Launch the browser and maximize and load the url


@smoke @regression
Scenario: Login for positive data

And Enter the username as 'DemoCsr'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify that login is successful

@regression @dilip
Scenario: Login for negative data

And Enter the username as 'Demo123'
And Enter the password as 'crmmsa'
When Click on the login button
But Verify condition failed

@sanity @smoke
Scenario: Login for different data

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmmsa'
When Click on the login button
Then Verify that login is successful
