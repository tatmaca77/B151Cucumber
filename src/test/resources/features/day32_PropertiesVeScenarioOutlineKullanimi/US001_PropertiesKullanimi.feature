Feature: US001 Google Sayfasi Testi
  Background: Google Sayfasina Gidilir
    Given kullanici "googleUrl" sayfasina gitti

    Scenario: TC01 Arama kutusunda volvo aratir
      * kullanici cikan cerezi kabul eder
      * kullanici google arama kutusunda "volvo" aratir
      * google sayfasinda basligin "volvo" icerdigini test eder
      * sayfayi kapatir


