Feature: User login

  Background:
    Given the homepage is opened
    Given the 'Customer' button is clicked
    Given the 'Login Tab' button is clicked
  Scenario Outline:
    Given the 'Username' field is filled with '<username>'
    And the 'Password' field is filled with '<password>'
    When the 'Login' button is clicked
    Then the '<errorMessage>' message is shown
    Examples:
      | username            | password  | errorMessage  |
      |                     |           |               |
      |                     | badpwd    |               |
      | notexist@fake.com   |           |               |
      | notexist@fake.com   | badpwd    |               |