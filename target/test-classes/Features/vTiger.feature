Feature: vtiger Functionality

Background:
Given user should be on login page

@Teste2e@Test
Scenario: E2E scenario

When user enters valid userid and password
And click on login button
Then user should be navigated to home page
When user click on new lead link
And enter all mandatory fields then click on save button
Then lead should be created successfully
When user click on new account link
And enter account name and click on save button
Then account should be created successfully
When user click on logout
Then user should be navigated to login page
And close the browser
