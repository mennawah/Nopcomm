@smoke
Feature: User can add different products to CompareList

  Scenario: User add htc phone product to comparelist
    Given   User navigates to Home page
    When    User click on add to comparelist button of HTC phone product
    Then    Green success message should appear
