@AndroidOrderTotalAmount
Feature: Order Total Amount
  Scenario: Order Total Amount
    Given Android  on the main screen
    And Android clicks to my account icon
    And Android enters "validEmail" to email checkbox
    And Android enters "validPassword" to password checkbox
    And Android clicks login button
    And Android clicks the homepage icon
    When Android clicks a physical product
    And Android clicks "Sepete Ekle" with text view
    And Android clicks the homepage icon
    When Android clicks on the second item
    And Android clicks "Sepete Ekle" with text view
    And Android clicks Sepetim button
    And Android clicks "Satın Al" with text view
    And Android clicks "PTT Kargo" with text view
    And Android clicks "Devam Et" with text view
    And Android clicks BankTransfer Radio Button
    And Android clicks "Devam Et" with text view
    Then Android confirms the total amount
