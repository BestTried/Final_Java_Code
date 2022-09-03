Feature: Valid user able to login to the application
Description: " User able to login in the application  with valid credentials"


@Sanity
@Regression
Scenario: User able to login in the application  with valid credentials
Given User able to open any Browser
And User able to enter the URL "https://www.Zoopla.co.uk"
When User able to able click in the signin button
And User able to enter the useName
And User able to enter the password
Then User able to verify the user information


