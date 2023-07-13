Feature: UserValidation

  @systemtest
 Scenario Outline: Verify if the user is Active
    Given User with <username> has access to imagur <accountEndpoint>
    When User tries to <GET> Account details with valid <clientID>
    Then User finds out to be an active user with Valid <response>
    Examples:

      |username         |accountEndpoint                 |GET|clientID       |response|
      |harsitagarwal2009|https://api.imgur.com/3/account/|Get|9fbac80c419c625|200     |