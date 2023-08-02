Feature: US003 Google Sayfasi Testi

  Scenario Outline: TC01 Arama kutusunda ford aratir
    Given kullanici "googleUrl" sayfasina gitti
    Then kullanici google arama kutusunda "<aranacakArac>" aratti
    But kullanici 1 saniye bekler
    And google sayfasinda basligin "<aranacakArac>" icerdigini test etti
    Examples:
      | aranacakArac |
      | arac1        |
      | arac2        |
      | arac3        |
      | arac4        |

   #Eger Scenario Outline ile verileri .properties dosyasindan almak istersek Examples altindaki verileri
  #.properties dosyasinda olusturdugumuz key'leri yazariz. Step definition'da olusturdugumuz parametreli method ile de
  # ConfigReader sayesinde bu keylerin degerini kullanmis oluruz.