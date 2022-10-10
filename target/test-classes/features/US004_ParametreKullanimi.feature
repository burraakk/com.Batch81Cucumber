@hepsiburada
Feature: US004 Parametre Kullanimi

  Scenario:  TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "https://www.hepsiburada.com" web sayfasina gider
    Then Kullanici 1 saniye bekler
    Then URL'in "hepsiburada" icerdigini test edin
    And Sayfayi kapatir

  Scenario:  TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "https://www.trendyol.com" web sayfasina gider
    Then Kullanici 1 saniye bekler
    Then URL'in "trendyol" icerdigini test edin
    And Sayfayi kapatir
