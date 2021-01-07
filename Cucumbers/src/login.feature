Feature:login Validation


Background:
Given open browser
|firefox|
|Chrome|
And navigate to facebook.com

@Smoke
Scenario: as a user I should be able to login using valid credential

When user type userid in email text box
And user type password in Password type box
And user click in login button
Then user should be in his/her profile page

@Regression
Scenario: as a user I should not be able to login using invalid credential

When user type "<userid>" in email text box
And user type "<password>" in Password type box
And user click in login button
Then user should not be in his/her profile page

Examples:
|userid|password|
|userid1|1234|
|userid2|5678|
|userid3|9876|