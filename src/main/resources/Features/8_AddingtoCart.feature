@smoke
Feature: user can add a product to shopping cart

  Scenario: User can select a product and add it to shopping car

    Given   User navigates to Home page
    And     navigates to gift card page
    When    user can select a product and put it in shopping cart
    Then    user can see the selected product in the shopping cart