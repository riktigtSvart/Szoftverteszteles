Feature: tab clicking feature

  Background:
    Given the homepage is opened
  Scenario:
    When click on 'HotelTab' button
    And click on 'FirstHotel' button2
    Then the NameOfHotel field should read 'Movenpick Grand Al Bustan'