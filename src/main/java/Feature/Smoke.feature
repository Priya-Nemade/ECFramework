Feature: This is Smoke feature.

Scenario: Verify invalid uname and password
	Given Chrome browser is opened
	When User enters invalid uname and password
	Then User will get an error message
Scenario: Verify valid uname and password
	Given Chrome browser is opened 