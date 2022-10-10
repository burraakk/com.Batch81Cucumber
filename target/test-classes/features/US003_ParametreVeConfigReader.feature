Feature:  Parametre Kullanimi

  Scenario:  TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "googleUrl" sayfasina gider
    Then Kullanici 1 saniye bekler
    Then URL'in "google" icerdigini test edin
    And Sayfayi kapatir

  Scenario:  TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazonUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    Then URL'in "amazon" icerdigini test edin
    And Sayfayi kapatir

  Scenario:  TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "facebookUrl" sayfasina gider
    Then Kullanici 1 saniye bekler
    Then URL'in "facebook" icerdigini test edin
    And Sayfayi kapatir

  Scenario:  TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "saucedemoUrl" sayfasina gider
    Then Kullanici 1 saniye bekler
    Then URL'in "saucedemo" icerdigini test edin
    And Sayfayi kapatir


