Feature: Register
Background: Browser launched
Given Browser should be installed
When user enters the URL
Then web application should open
@Register
Scenario: Register functionality
Given The web application should be open
When The user enters User Name "pjdjdhf54646"
And User enters valid First Name as "Diana" 
And Last Name as "M" 
And Password as "hershley12"  
And Confirm Password as "hershley12" 
And Gender as Female
And E-Mail as "dianacool123@gamil.com" 
And Mobile Number as "9856321478" 
And DOB as " 24/09/2018" 
And Address as "California" 
And Security question as What is your Pet Name?
And Answer "Bravo"
Then Registered successfully 
 
@Login 
Scenario Outline: Login 
Given the user must be registered
When the user enters "<username>" and "<password>"
Then Login to the home page
Examples: 
|username| |password|
|Lalitha| |Password123| 

@Search 
Scenario: Search for a product
Given The user logins with his respective credentials
When user types the required product
And clicks find details
Then the detais of the product should be displayed

@cart
Scenario: user proceeds to payment with zero items in the cart
Given the user should be registered in TestMe App
When user searches for a product
Then the cart option is not displayed