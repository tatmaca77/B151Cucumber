Feature: US002 Google Sayfasi Testi

  @positive
  Scenario: TC01 Arama kutusunda volvo aratir
    Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
    * kullanici google arama kutusunda "volvo" aratir
    * kullanici 3 saniye bekler
    * google sayfasinda basligin "volvo" icerdigini test eder

  Scenario: TC02 Arama kutusunda ford aratir
    Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
    Then kullanici google arama kutusunda "ford" aratir
    But kullanici 3 saniye bekler
    And google sayfasinda basligin "ford" icerdigini test eder
    And sayfayi kapatir

  @negative
  Scenario: TC03 Arama kutusunda audi aratir
    Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
    Then kullanici google arama kutusunda "audi" aratir
    But kullanici 3 saniye bekler
    And google sayfasinda basligin "audi" icerdigini test eder
