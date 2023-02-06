@smoke
Feature: User can add different products to Wishlist

  Scenario: User add htc phone product to Wishlist
    Given   User navigates to Home page
    When    User click on add to wishlist button of HTC phone product
    Then    Green success message should be shown to the user

  Scenario: User add htc phone product to Wishlist and validate its quantity
    Given   User navigates to Home page
    When    User click on add to wishlist button of HTC phone product
    And     User click on Wishlist tab
    Then    User should be navigated to wishlist page
