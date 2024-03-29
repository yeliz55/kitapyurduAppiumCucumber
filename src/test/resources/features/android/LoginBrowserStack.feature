Feature: Android Login
  @AndroidLoginBrowserStack
  Scenario: Android Valid Login Test
    Given Android  on the "Browser Stack" main screen
    And Android clicks to my account icon
    And Android enters "validEmail" to email checkbox
    And Android enters "validPassword" to password checkbox
    And Android clicks login button
    Then Android verifies logged in