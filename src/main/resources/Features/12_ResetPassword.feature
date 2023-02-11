@smoke
Feature:  check Reset Password
  Scenario: user can login with valid data
    Given   user go to login
    When click on Forgot Password and enter email
    Then a message should be displayed to the user