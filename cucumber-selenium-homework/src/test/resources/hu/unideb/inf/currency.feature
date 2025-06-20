Feature: check currency rates

  Background:
    Given the homepage is opened

    Scenario Outline:
      Given click on 'Choose Currency' button
      When click on '<currency>' button
      Then the '<car_price>' message is shown
      Examples:
        | currency  | car_price   |
        | EUR       | EUR 88.13   |
        | PHP       | PHP 5671.25 |
        | SAR       | SAR 375.22  |
        | GBP       | GBP 75.38   |