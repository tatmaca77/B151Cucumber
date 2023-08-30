Feature: US001 Google Testi

  @arac1
Scenario: TC01 Arama kutusunda volvo aratir
  Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
* kullanici google arama kutusunda "volvo" aratir
* kullanici 3 saniye bekler
* google sayfasinda basligin "bmw" icerdigini test eder
  And sayfayi kapatir
    @arac2
  Scenario: TC02 Arama kutusunda ford aratir
    Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
    Then kullanici google arama kutusunda "ford" aratir
    But kullanici 2 saniye bekler
    And google sayfasinda basligin "ford" icerdigini test eder
    And sayfayi kapatir
  @arac3
  Scenario: TC02 Arama kutusunda audi aratir
    Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
    Then kullanici google arama kutusunda "audi" aratir
    But kullanici 2 saniye bekler
    And google sayfasinda basligin "audi" icerdigini test eder
    And sayfayi kapatir