@BankTransfer
Feature: New User Order with Bank Transfer

  Scenario: New User Order with Bank Transfer Test

    Given User goes to url
    When User ckicks accept button on popup
    When User adds a  physical product to basket
    When User ckicks accept button on popup
    And User clicks add to basket button
    And User clicks my basket icon
    And User clicks buy icon
    And User click to Register Button
    And The user fills in the information in the form with valid values
    And User click Register Button
    And User verifies Account Created message is visible
    And User cliks Add adress button
    And User fills in Address Form valid inputs
    Then User verifies that they have successfully added the address
    And User cliks ok button
    And User clicks my basket icon
    And User clicks buy icon
    And User clicks continue button
    And User clicks Bank transfer radio button
    And User clicks continue button
    And User clicks preinformation check box
    And User confirm order button
    Then User verifies order created message is visible