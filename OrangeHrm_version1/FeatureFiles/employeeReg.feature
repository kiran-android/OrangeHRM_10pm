#Author: kiran

@tag
Feature: New Employee Registration
			 
			 I Want to use this template to check new Employee Registration
@tag1
Scenario: Check New Employee Registration with valid inputs
	Given i open browser with url "http://orangehrm.qedgetech.com"
  Then i should see login page
  When i enter username as "Admin"
  And i enter password as "Qedge123!@#"
  And i click login
  Then i should see admin module
  When i goto add employee page
  And i enter firstname as "Richards"
  And i enter lastname as "J"
  And i click save
  Then i should see new registered employee in employee list
  When i click logout
	Then i should see login page 
	When i close browser   
