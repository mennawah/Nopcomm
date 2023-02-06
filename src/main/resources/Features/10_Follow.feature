@smoke
Feature: User can follow nopcomm on( Facebook,Twitter,Youtube)

  Scenario: User opens facebook link
    Given    User navigates to Home page
    When    User click on Facebook icon
    Then    this link "https://www.facebook.com/nopCommerce" is opened

  Scenario: User opens twitter link
    Given    User navigates to Home page
    When    User click on Twitter icon
    Then    this link "https://twitter.com/nopCommerce" is opened

  Scenario: User opens youtube link
    Given    User navigates to Home page
    When    User click on Youtube icon
    Then    this link "https://www.youtube.com/user/nopCommerce" is opened