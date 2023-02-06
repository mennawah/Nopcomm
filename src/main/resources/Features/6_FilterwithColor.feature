@smoke
Feature: user can filter with color

  Scenario: User can select a product and filter with color

    Given   User navigates to Home page
    And     navigates to shoes display page
    When    user choose a color from filter option
    Then    user can find the item with the color he chooses