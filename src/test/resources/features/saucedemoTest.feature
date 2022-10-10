Feature: Saucedemo Test

  @saucedemo
  Scenario: Saucedemo login

    Given Navigate to Saucedemo Website
    Then Enter the correct username
    Then Enter the correct password
    And Click on login button
    And Choose price low to high
    And Verify that PRICE (LOW TO HIGH) is visible
    And Close driver