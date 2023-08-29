Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidilir
    Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder

  @volvo
  Scenario: TC01 Arama kutusunda volvo aratir
    * kullanici google arama kutusunda "arac1" aratir
    * kullanici 3 saniye bekler
    * google sayfasinda basligin "arac2" icerdigini test eder

  Scenario: TC02 Arama kutusunda ford aratir
    Then kullanici google arama kutusunda "arac2" aratir
    But kullanici 1 saniye bekler
    And google sayfasinda basligin "arac2" icerdigini test eder

  Scenario: TC03 Arama kutusunda audi aratir
    Then kullanici google arama kutusunda "arac3" aratir
    But kullanici 2 saniye bekler
    And google sayfasinda basligin "arac3" icerdigini test eder
    And sayfayi kapatir