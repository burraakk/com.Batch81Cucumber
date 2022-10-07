@Background
Feature: US001 Background Kullanimi

  Background: Ortak Adimlar
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici Amazon'da Nutella aratir
    Then Kullanici Nutella aratir
    And Sonuclarin Nutella icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC02 Kullanici Amazon'da Selenium aratir
    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC03 Kullanici Amazon'da Iphone aratir
    Then Kullanici Iphone aratir
    And Sonuclarin Iphone icerdigini test eder
    And Sayfayi kapatir
