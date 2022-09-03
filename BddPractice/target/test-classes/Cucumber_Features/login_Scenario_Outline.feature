Feature: Valid user able to login in the application and buy, sale, return, clear

Scenario Outline: User able to login the application with the valid credntials, user unable to login the application with 
        invalid credntials, user unable to login the application with more than 8 characters    # how to do 

       Given User able to open the any browser 
       And   User able to enter the <URL>
       When  User able to click on the Sign in button
       And   user able to enter the <userName>
       And   user able to enter the <password>
       And   User able to click on the login button  
       Then  User able to verify the user information on the screen
       
       Examples: 
      | URL                      |userName                       | password       |
      | https://www.zoopla.co.uk |alammhommad97@gmail.com        |SAYEDawan2008@  |
      | https://www.zoopla.co.uk |alammhommad97@gmail.com        |SAYEDawan@      |
      | https://www.zoopla.co.uk |alammhommad97@gmail.com        |2008@           |
      | https://www.zoopla.co.uk |alammhommad10711232@gmail.com  |SAYEDawan2008@  |
      | https://www.zoopla.co.uk |alammhommad9712312323@gmail.com|SAYEDawan2008@  |
