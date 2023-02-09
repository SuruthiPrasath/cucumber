Feature:
To validate forgot password functionality in fb
@smoke
Scenario:
To validate forgot password using phone number

Given enter login page
And maximize window
And click forgot password button
When enter phone number
|123456789|selenium|java|python|java@123|
And click search button
Then recover page