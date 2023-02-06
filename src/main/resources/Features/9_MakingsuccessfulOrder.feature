@smoke
Feature: user can make a successful order

  Scenario: check that user can proceed in checkout

    Given   User navigates to Home page
    And     navigates to gift card page
    When    user can select a product and put it in shopping cart
    And     Proceed in checkout procedures
    And user click on login button
    And  complete checkout
    Then    user can make a successful order