Feature: tabulators feature

  Background:
    Given the homepage is opened

  Scenario Outline:
    When the '<tabulator>' button is clicked3
    Then the '<title>' message is shown
    Examples:
      | tabulator            | title                      |
      | Flights              | Search For Best Flights    |
      | Hotels               | Search For Best Hotels     |
      | Tours                | Find Best Tours            |
      | Cars                 | Recommended Transfer Cars  |
      | Visa                 | Submit Your Visa Today     |