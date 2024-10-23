Feature: To validate registration functionality

@smoke @wip0607
Scenario: To validate registration using  valid details 

Given User starts "chrome" browser
And User Launches app using url "https://adactinhotelapp.com/"
When user clicks in link using the xpath "//a[text()='New User Register Here']"
And user enters the following details  in registration form from Map
| username | password | re-password | fullname | email id | captcha |
| Padmaja | padhu124 | padhu124 | Padmaja S | sanigantipadmaja@gmail.com | contextedvc |

