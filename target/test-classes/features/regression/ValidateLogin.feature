Feature: To Validate Login
Scenario: To Validate Login using valid Credentials.

Given User starts "chrome" browser.
And User Launches app using url "https://adactinhotelapp.com/"
When User enters "reyaz0806" username in username textbox using xpath "//input[@name='username']"
And User enters "reyaz123" password in password textbox using xpath "//input[@name='password']"
And User clicks login button using xpath "//input[@name='login']"
Then User validates title to be "Adactin.com - Search Hotel"