@smoke
Feature:  new user can register successfully to nopcomm
  Scenario: user can register with valid data
    Given user go to register page
    When  user click on Gender type
    And   user write first name
    And   user write last name
    And   user choose birth date
    And   user write valid email
    And   user write password matches the criteria
    And   user write the password in confirm password field
    And   user clicks on register button
    Then  user is registered successfully