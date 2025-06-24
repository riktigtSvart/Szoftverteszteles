Feature: check currency rates

  Background:
    Given the homepage is opened

    Scenario Outline:
      Given click on 'Choose Currency' button
      When click on '<currency>' button
      Then the '<car_price>' message is shown in field
      Examples:
        | currency  | car_price   |
        | EUR       | EUR 88.13   |
        | PHP       | PHP 5,561.65|
        | SAR       | SAR 375.07  |
        | GBP       | GBP 74.31   |