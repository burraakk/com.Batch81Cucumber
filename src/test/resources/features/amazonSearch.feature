Feature: Amazon Search

  Scenario: TC01 Kullanici Amazon'da Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella aratir
    And Sonuclarin Nutella icerdigini test eder
    And Sayfayi kapatir