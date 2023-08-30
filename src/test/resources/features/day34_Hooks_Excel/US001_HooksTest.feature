Feature: US001 Google Testi

  @arac1
Scenario: TC01 Arama kutusunda volvo aratir
  Given kullanici "googleUrl" sayfasina gitti
    And kullanici cerezi kabul eder
* kullanici google arama kutusunda "volvo" aratir
* kullanici 3 saniye bekler
* google sayfasinda basligin "bmw" icerdigini test eder
  And sayfayi kapatir