$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/VinayKrishna141/eclipse-workspace/CucumberFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#WITHOUT EXAMPLES Keyword((use Scenario)"
    },
    {
      "line": 4,
      "value": "#Scenario: Free CRM Login Test Scenario"
    },
    {
      "line": 5,
      "value": "#"
    },
    {
      "line": 6,
      "value": "#Given user is already on login page"
    },
    {
      "line": 7,
      "value": "#When title of the login page"
    },
    {
      "line": 8,
      "value": "#Then user enters \"vineeey\" and \"Vinay@1994\""
    },
    {
      "line": 9,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 10,
      "value": "#Then user is on home page"
    },
    {
      "line": 13,
      "value": "#WITH EXAMPLES Keyword(use Scenario Outline: when example used)--"
    }
  ],
  "line": 14,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of the login page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "vineeey",
        "Vinay@1994"
      ],
      "line": 25,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "tom",
        "test542"
      ],
      "line": 26,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4189438,
  "status": "passed"
});
formatter.before({
  "duration": 125867,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of the login page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"vineeey\" and \"Vinay@1994\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 40520204578,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.title_of_the_login_page()"
});
formatter.result({
  "duration": 32349427,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 66133,
  "status": "passed"
});
formatter.after({
  "duration": 83200,
  "status": "passed"
});
formatter.before({
  "duration": 132267,
  "status": "passed"
});
formatter.before({
  "duration": 304213,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of the login page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"tom\" and \"test542\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 46423443019,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.title_of_the_login_page()"
});
formatter.result({
  "duration": 17282126,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 90880,
  "status": "passed"
});
formatter.after({
  "duration": 81066,
  "status": "passed"
});
});