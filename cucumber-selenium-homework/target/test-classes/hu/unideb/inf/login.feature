Feature: User login

  Background:
    Given the homepage is opened
    Given the 'Customer' button is clicked
    Given the 'Login Tab' button is clicked
  Scenario Outline:
    Given the 'Username' field is filled with '<username>'
    And the 'Password' field is filled with '<password>'
    When the 'Login' button is clicked
    Then the '<errorMessage>' errorMessage is shown
    Examples:
      | username            | password  | errorMessage  |
      |                     |           | Invalid Login |
      |                     | badpwd    | Invalid Login |
      | notexist@fake.com   |           | Invalid Login |
      | notexist@fake.com   | badpwd    | Invalid Login |