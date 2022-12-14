@US009
Feature:Class Calismasi

  Scenario Outline:
    When kullanici "editordatatablesUrl" adresine gider
    Then  new butonuna basar
    And isim bolumune "<firstname>" girer
    Then Kullanici 1 saniye bekler
    And soyisim bolumune "<lastname>" girer
    Then Kullanici 1 saniye bekler
    And position bolumune"<position>" girer
    Then Kullanici 1 saniye bekler
    And ofis bolumune "<ofisbilgisi>" girer
    Then Kullanici 1 saniye bekler
    And extension bolumune "<extension>" girer
    Then Kullanici 1 saniye bekler
    And startdate bolumune"<Stardate>"  girer
    Then Kullanici 1 saniye bekler
    And salary bolumune "<Salary>" girer
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And Sayfayi kapatir
    Examples:
      | firstname | lastname | position | ofisbilgisi | extension | Stardate   | Salary |
      | Ali       | Veli     | Qa       | Google      | Senior    | 2022-10-12 | 15000  |
      | Ahmet     | Mehmet   | Qa       | Google      | Junior    | 2022-10-12 | 10500  |
      | Hasan     | Duman    | Dev      | Amazon      | Junior    | 2022-10-12 | 25000  |
      | Akin      | Alkan    | Dev      | Amazon      | Senior    | 2022-10-12 | 50000  |
      | Orhan     | Duman    | PO       | WallMart    | Senior    | 2022-10-12 | 30000  |

    #5 farkli kullanici bilgisi girer