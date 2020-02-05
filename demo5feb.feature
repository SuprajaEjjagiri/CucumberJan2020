Feature: TestMeApp
 Background: User login
 @FunctionalTest
 Scenario Outline: Login
 Given user login to TestMeApp
 When user provides "<username>" and "<password>" as credentials
 Then login is succesfull
 Examples:
 |username|password|
 |adimn|Password456| 
 
 @datadriven
 Scenario: Adding new category
 Given user adds a new category
 When user adds category name as
 |Sports|
 Then user adds the subcategory under sports category
 |Basketball|
 |Volleyball|
  