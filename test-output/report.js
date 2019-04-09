$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/shareit/Eclipse/CricBuzz/src/main/java/Features/cricbuzz.feature");
formatter.feature({
  "line": 1,
  "name": "CricBuzz application feature",
  "description": "",
  "id": "cricbuzz-application-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "CricBuzz application scenario",
  "description": "",
  "id": "cricbuzz-application-feature;cricbuzz-application-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on IPL link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks points table",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User User clicks a team",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on logo and navigate to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "IPLStepDefinition.user_open_the_browser()"
});
formatter.result({
  "duration": 7492057938,
  "status": "passed"
});
formatter.match({
  "location": "IPLStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 10267668102,
  "status": "passed"
});
formatter.match({
  "location": "IPLStepDefinition.user_clicks_on_IPL_link()"
});
formatter.result({
  "duration": 1514867816,
  "status": "passed"
});
formatter.match({
  "location": "IPLStepDefinition.user_clicks_points_table()"
});
formatter.result({
  "duration": 2696713456,
  "status": "passed"
});
formatter.match({
  "location": "IPLStepDefinition.user_User_clicks_a_team()"
});
formatter.result({
  "duration": 4884786458,
  "status": "passed"
});
formatter.match({
  "location": "IPLStepDefinition.click_on_logo_and_navigate_to_homepage()"
});
formatter.result({
  "duration": 4757794100,
  "status": "passed"
});
formatter.match({
  "location": "IPLStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 958970858,
  "status": "passed"
});
});