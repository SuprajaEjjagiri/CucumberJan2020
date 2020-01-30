Feature: Pixel store pos

  Background: 
    Given sales executive logged into the machine
  
@RegressionTest
Scenario: Executive signup
Given executive is at the signup registration   
When executive provides "admin" and "admin"
 Then signup successful
 @Smoke @RegressionTest 
 Scenario: shopping cart
 Given executive added items to the cart
 When item price is calculated
 Then bill is generated with final amount 

 

 @FunctionalTest
  Scenario Outline: Sales executive signIn
    When Sales executive provides "<user>" and "<password>" as credentials
    Then Login is successful
    
 

    Examples: 
      | user    | password    |
      | Lalitha | password123 |
      | John    | Ravi1234     |

  @datadriven
  Scenario: Search a product
  When Larry searches for products in the search field
  |Head|
  |Hand|
  |Lap|
  Then Larry verifies the product availability