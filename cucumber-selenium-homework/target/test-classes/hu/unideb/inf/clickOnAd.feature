Feature: check ad buttons

  Background:
    Given the homepage is opened

  Scenario Outline:
    When click on '<adButton>' adButton
    Then the '<adTitle>' message is shown in title
    Examples:
      | adButton  | adTitle                      |
      | Hotels    | Search For Best Hotels       |
      | Budget    |                              |
      | Cars      | Recommended Transfer Cars    |
