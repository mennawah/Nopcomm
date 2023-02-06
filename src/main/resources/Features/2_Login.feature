@smoke
Feature:     checking login functionality
  Scenario: user can login with valid data
    Given   user go to login
    When    user login with "valid" "Mennatest@gmail.com" and "Valid@2023"
    And     user click on login button
    Then    user is logged in to nopcommerce


  Scenario: user can login with invalid data
    Given   user go to login
    When    user login with "invalid" "koko@gmail.com" and "mydesk2020"
    And     user click on login button
    Then    error message should appear login is unsuccessful