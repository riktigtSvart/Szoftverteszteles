Feature: Subscribe Newsletter

  Background:
    Given the homepage is opened
  Scenario Outline:
    Given the 'Name' field is filled with '<name>'
    And the 'Email' field is filled with '<email>'
    When the 'Subscribe' button is clicked
    Then the '<NewsLetterMessage>' NewsLetterMessage is shown
    Examples:
      | name   | email  | NewsLetterMessage       |
      |        |        | name missing            |
      |        | email  | name missing            |
      | name   |        | email missing           |
      | name   | email  | Successfully Subscribed |