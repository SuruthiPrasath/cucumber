Feature:
To valid fb login page
Background:
Given enter fb login page
Scenario Outline:
To validate login using email and password
And maximize window
When enter "<EmailId>" and "<Password>"
And click login button
Then invalid credential page
Examples:
|EmailId|Password|
|java|java@123|
|selenium|selenium@123|
|framework|framework@!23|
|python|python@123|
|core|core@123|

