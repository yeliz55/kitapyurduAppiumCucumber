Feature: New User Orde with Bank Transfer on Android

  @AndroidBankaTransferi
  Scenario: New User Orde with Bank Transfer on Android
    Given Android  on the main screen
    When Android clicks a physical product
    And Android clicks "Sepete Ekle" with text view
    And Android clicks "Giriş Yap / Üye Ol" button
    And Android clicks Uye Ol button
    And Android fills in the information in the form with valid values
    And Android clicks Sepetim button
    And Android clicks "Satın Al" with text view
    And Android clicks "Adres Ekle" with text view
    And The Android fills in the information on the address page
    And Android clicks "PTT Kargo" with text view
    And Android clicks "Devam Et" with text view
    And Android clicks BankTransfer Radio Button
    And Android clicks "Devam Et" with text view
    And Android verifies total price
    And Android clicks preInformation checkBox
    And Android clicks "Siparişi Onaylayın" with text view
    And Android verifies the order is created
