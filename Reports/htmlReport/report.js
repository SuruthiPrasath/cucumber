$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature files/FbForgotPassword.feature");
formatter.feature({
  "name": "",
  "description": "To validate forgot password functionality in fb",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "To validate forgot password using phone number",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.enter_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "maximize window",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click forgot password button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_forgot_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter phone number",
  "rows": [
    {
      "cells": [
        "123456789",
        "selenium",
        "java",
        "python",
        "java@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_phone_number(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: index: 10, Size: 5\r\n\tat io.cucumber.datatable.DataTable.rangeCheck(DataTable.java:295)\r\n\tat io.cucumber.datatable.DataTable.access$800(DataTable.java:43)\r\n\tat io.cucumber.datatable.DataTable$ListView.get(DataTable.java:890)\r\n\tat io.cucumber.datatable.DataTable$ListView.get(DataTable.java:884)\r\n\tat org.stepdefinition.StepDefinition.enter_phone_number(StepDefinition.java:34)\r\n\tat ✽.enter phone number(src/test/resources/Feature files/FbForgotPassword.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "recover page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.recover_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature files/FbLogin.feature");
formatter.feature({
  "name": "",
  "description": "  To validate login functionality of facebook",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.enter_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using valid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "enter valid email and invalid password",
  "rows": [
    {
      "cells": [
        "George",
        "Benat",
        "Suruthi",
        "Prasath"
      ]
    },
    {
      "cells": [
        "Jesrin",
        "Mento",
        "Johnpaul",
        "jesro"
      ]
    },
    {
      "cells": [
        "Gabby",
        "Neha",
        "subin",
        "subiksha"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_valid_email_and_invalid_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 5, Size: 4\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat java.util.Collections$UnmodifiableList.get(Unknown Source)\r\n\tat org.stepdefinition.StepDefinition.enter_valid_email_and_invalid_password(StepDefinition.java:57)\r\n\tat ✽.enter valid email and invalid password(src/test/resources/Feature files/FbLogin.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.enter_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using invalid email and valid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "enter invalid email and valid password",
  "rows": [
    {
      "cells": [
        "username",
        "sururhiprasath"
      ]
    },
    {
      "cells": [
        "password",
        "Gabbyneha"
      ]
    },
    {
      "cells": [
        "phonenumber",
        "12345678"
      ]
    },
    {
      "cells": [
        "email",
        "greens@1234"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_invalid_email_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.enter_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using invalid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "enter invalid email and invalid password",
  "rows": [
    {
      "cells": [
        "Username",
        "password",
        "phnumber"
      ]
    },
    {
      "cells": [
        "Prasathsuruthi",
        "suruthi@123",
        "123456789"
      ]
    },
    {
      "cells": [
        "greens@123",
        "greens",
        "098765432"
      ]
    },
    {
      "cells": [
        "Javaselenium",
        "java@123",
        "puthon"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_invalid_email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});