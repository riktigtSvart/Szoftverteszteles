Feature: cars feature

  Background:
    Given the homepage is opened

  Scenario Outline:
    Then the '<car>' is '<car_type>' type is shown
    Examples:
      | car           | car_type                        |
      | Hyundai i10   | Hyundai i10 or similar          |
      | Ford Focus    | Ford Focus 2023                 |
      | Toyota Camry  | Toyota Camry 2023 full options  |
