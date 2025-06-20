Feature: tab clicking feature

  Background:
    Given the homepage is opened
  Scenario:
    When click on 'Hotel Tab' button
    And click on 'First Pic' button2
    Then the NameOfHotel field should read 'Movenpick Grand Al Bustan'