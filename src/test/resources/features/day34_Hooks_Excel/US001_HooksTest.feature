Feature: US001 Google Testi

Scenario: TC01 Arama kutusunda volvo aratir
  Given kullanici "googleUrl" sayfasina gitti
* kullanici google arama kutusunda "volvo" aratir
* kullanici 3 saniye bekler
* google sayfasinda basligin "bmw" icerdigini test eder
  And sayfayi kapatir