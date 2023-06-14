Feature: Login
  Scenario: Verify Login with Valid Credentials
    Given User has valid credentials
    When User tries to login with credentials
    Then User should be navigated to homepage
