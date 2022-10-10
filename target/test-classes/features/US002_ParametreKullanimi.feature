@parametre
Feature: US002 Parametre Kullanimi

  Background: Ortak Adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici Amazon'da Parametreli Arama Yapar

    Then Kullanici "Rotring Rapid" aratir
    And Sonuclarin "Rotring Rapid" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC02 Kullanici Amazon'da Parametreli Arama Yapar

    Then Kullanici "Nutella" aratir
    And Sonuclarin "Nutella" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC03 Kullanici Amazon'da Parametreli Arama Yapar

    Then Kullanici "pringles" aratir
    And Sonuclarin "pringles" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC04 Kullanici Amazon'da Parametreli Arama Yapar

    Then Kullanici "xiaomi" aratir
    And Sonuclarin "xiaomi" icerdigini test eder
    And Sayfayi kapatir