@All
Feature: Amazon Search

  @gp1
  Scenario: TC01 Kullanici Amazon'da Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella aratir
    And Sonuclarin Nutella icerdigini test eder
    And Sayfayi kapatir

  @gp3
  Scenario: TC02 Kullanici Amazon'da Selenium aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder
    And Sayfayi kapatir

  @gp2
  Scenario: TC03 Kullanici Amazon'da Iphone aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici Iphone aratir
    And Sonuclarin Iphone icerdigini test eder
    And Sayfayi kapatir
