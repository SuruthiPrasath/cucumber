Feature: 
  To validate login functionality of facebook

  Background: 
    Given enter fb login page

  @Smoke
  Scenario: 
    To validate login using valid email and invalid password

    When enter valid email and invalid password
      | George | Benat | Suruthi  | Prasath  |
      | Jesrin | Mento | Johnpaul | jesro    |
      | Gabby  | Neha  | subin    | subiksha |
    And click login button
    Then User have to be in invalid credentials page

  @sanity
  Scenario: 
    To validate login using invalid email and valid password

    When enter invalid email and valid password
      | username    | sururhiprasath |
      | password    | Gabbyneha      |
      | phonenumber |       12345678 |
      | email       | greens@1234    |
    And click login button
    Then User have to be in invalid credentials page

  @smoke
  Scenario: 
    To validate login using invalid email and invalid password

    When enter invalid email and invalid password
      | Username       | password    | phnumber  |
      | Prasathsuruthi | suruthi@123 | 123456789 |
      | greens@123     | greens      | 098765432 |
      | Javaselenium   | java@123    | puthon    |
    And click login button
    Then User have to be in invalid credentials page
