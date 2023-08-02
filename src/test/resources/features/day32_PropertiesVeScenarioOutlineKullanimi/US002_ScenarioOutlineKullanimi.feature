Feature: US002 Google Sayfasi Testi

  Scenario Outline: TC01 Arama kutusunda ford aratir
    Given kullanici "googleUrl" sayfasina gitti
    Then kullanici google arama kutusunda "<aranacakArac>" aratir
    But kullanici 1 saniye bekler
    And google sayfasinda basligin "<aranacakArac>" icerdigini test eder
    Examples:
      | aranacakArac |
      | ford         |
      | volvo        |
      | audi         |
      | mercedes     |

    #Scenario Outline kullanimi TestNG'deki data provider mantigi ile ayni calisir.
  #Scenario Outline yapisini kullandiktan sonra birden fazla veri ile arama islemi yapmak yada login islemi yapmak
  #istiyorsak aratmak istedigimiz kelimeyi "< >" icine belirtiriz. Daha önce parametreli method olusturdugumuz icin
  #tekrar parametreli method olusturmaya gerek kalmadan Scenario Outline yapisina tiklayarak alt kisimda cikan
  #Examples: bölümünde yukaridaki örnekteki gibi belirttigimiz baslik altina istedigimiz verileri girerek sirasiyla
  #arama islemlerini gerceklestirmis oluruz.

