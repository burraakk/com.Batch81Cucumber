@US007
Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then Kullanici 3 saniye bekler
    When URL'in "<arananKelime>" icerdigini test edin
    And Sayfayi kapatir
    Examples:
      | arananUrl            | arananKelime      |
      | facebookUrl          | facebook          |
      | googleUrl            | google            |
      | automationexerciseUrl| automationexercise|
      | saucedemoUrl         | saucedemo         |
      | brcUrl    | bluerentalcars    |