@smoke
Feature: user can search for any product

  Scenario Outline: user search using product name
    Given User navigates to Home page
    When  User search with product name "<name>" in search field
    And   User click search button
    Then  results will appear if exists "<name>"

    Examples:
      | name   |
      | camera   |
      | apple |
      | cards   |

