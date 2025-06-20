Feature: tab clicking feature

  Background:
    Given the homepage is opened
  Scenario:
    Given click on 'Hotel Tab' button
    Given the 'Place' field is filled with 'Dubai'
    Given the 'CheckIn' field is filled with '01-07-2025'
    Given the 'CheckOut' field is filled with '02-07-2025'
    When click on 'Search' button2
    Then the NumberOfHotels field should read '43'