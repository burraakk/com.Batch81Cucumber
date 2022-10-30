@US005
Feature: US005 Blue RentaCar Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    And Kullanici 2 saniye bekler
    Then Login yazisina tiklar
    And Kullanici 2 saniye bekler
    And gecersiz username girer
    And Kullanici 2 saniye bekler
    And gecersiz password girer
    And Kullanici 2 saniye bekler
    And Login butonuna basar
    And Kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir