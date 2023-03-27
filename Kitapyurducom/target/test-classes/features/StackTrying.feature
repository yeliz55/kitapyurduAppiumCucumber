Feature: Stack
  @Stack
  Scenario: Stack test
    Given User goes to url on browserstack
    When User click to MyAccount Icon
    And User send "validEmail" to email box
    And User send "validPassword" to password box
    And User click loginButton on login page
    And User verifies the email on the header equal with "validEmail"
    When User clear the cookies