Feature: Chrome - Verify Elements on HomePage

Background: 
	Given I access nasdaq homepage
	
Scenario: Find a Symbol
	Given I enter a symbol "AAPL"
	Then User is taken to Page