@smoke
Feature: user is able to switch between currencies

  Scenario: User can switch between currencies from Dollar to Euro

    Given   User navigates to Home page
    When    User choose euro currency
    Then    user can see all the prices are changed from dollar to euro