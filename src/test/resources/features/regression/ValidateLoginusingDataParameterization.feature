Feature: To Validate Login
Scenario Outline: To Validate Login using different Credentials.

Given User starts "chrome" browser.
And User Launches app using url "https://adactinhotelapp.com/"
When User enters '<username>' username in username textbox using xpath "//input[@name='username']"
And User enters '<password>' password in password textbox using xpath "//input[@name='password']"
And User clicks login button using xpath "//input[@name='login']"
Then User validates title to be '<expTitle>'

Examples: 
| username | password | expTitle |
| reyaz0806 | reyaz123 | Adactin.com - Search Hotel |
| reyaz0806 | reyaz456 | Adactin.com - Hotel Reservation System |
| reyaz1212 | reyaz123 | Adactin.com - Hotel Reservation System |
| reyaz456 | reyaz123 | Adactin.com - Hotel Reservation System |