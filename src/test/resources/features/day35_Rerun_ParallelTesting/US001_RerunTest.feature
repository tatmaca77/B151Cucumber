Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidilir
    Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
  @arc
  Scenario: TC01 Arama kutusunda volvo aratir
    * kullanici google arama kutusunda "volvo" aratir
    * kullanici 3 saniye bekler
    * google sayfasinda basligin "bmw" icerdigini test eder
  @arc
  Scenario: TC02 Arama kutusunda ford aratir
    Then kullanici google arama kutusunda "ford" aratir
    But kullanici 1 saniye bekler
    And google sayfasinda basligin "ford" icerdigini test eder
  @arc
  Scenario: TC03 Arama kutusunda audi aratir
    Then kullanici google arama kutusunda "audi" aratir
    But kullanici 2 saniye bekler
    And google sayfasinda basligin "mercedes" icerdigini test eder
    And sayfayi kapatir