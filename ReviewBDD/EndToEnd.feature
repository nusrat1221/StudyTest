Feature: EndtoEnd Validation 
Scenario: EndtoEnd scenario for buying a product
Given Navigate to url
When User will hover on my menu
And user click on any submenu
And User click any supecific product from submenu
And User will select any colour
And  User will select any size
And User will click add cart button
Then User should see one product into cart 
When User nevigate back
And User add another product into cart 
Then User should see two product into cart 


