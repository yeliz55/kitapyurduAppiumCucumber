Feature: Android Register
@AndroidRegister
  Scenario: Android Valid Register Test
    Given Android  on the main screen
    And Android clicks to my account icon
    And Android clicks Free Register Button
    And Android types "a name" to name box
    And Android types "a last name" to last name box
    And Android types "email" to email box
    And Android types "password" to password box
    And Android types "password" to confirmation password box
    And Android click personal data privacy check box
    And Android click Register Button on register page
    And Android verifies Account Created message is visible