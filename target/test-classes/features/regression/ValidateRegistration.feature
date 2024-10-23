Feature: To validate registration functionality

@smoke @wip0606
Scenario: To validate registration using  valid details 

Given User starts "chrome" browser
And User Launches app using url "https://adactinhotelapp.com/"
When user clicks in link using the xpath "//a[text()='New User Register Here']"
And user enters the text "Padmaja" in the textbox using xpath "//input[@name='username']"
And user enters the password  "Padhu" in the textbox using the xpath "//input[@name='password']"
And user reenters the password  "Padhu" in the textbox using xpath "//input[@name='re_password']"
And user enters the fullname "Padmaja S" in the textbox using xpath "//input[@name='full_name']"
And user enters the email "sanigantipadmaja@gmail.com" in the textbox using xpath "//input[@name='email_add']"
And user enters the captcha "exility" in the textbox using xpath "//input[@name='captcha']"
