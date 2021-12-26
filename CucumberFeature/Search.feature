Feature: Amazon search
Scenario Outline:  Search functionality test
Given User is on amazon homepage
When User enter the item on search field "<Search>"
And user click on search button
Then user on search page

Examples:

|Search| 
|Qa testing|


