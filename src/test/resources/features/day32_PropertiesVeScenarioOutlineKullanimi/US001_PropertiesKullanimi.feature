Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidilir
    Given kullanici "googleUrl" sayfasina gitti

  Scenario: TC01 Arama kutusunda volvo aratir
    * kullanici google arama kutusunda "volvo" aratir
    * kullanici 3 saniye bekler
    * google sayfasinda basligin "volvo" icerdigini test eder

  Scenario: Arama kutusunda ford aratir
    Then kullanici google arama kutusunda "ford" aratir
    But kullanici 1 saniye bekler
    And google sayfasinda basligin "ford" icerdigini test eder

  Scenario: Arama kutusunda audi aratir
    Then kullanici google arama kutusunda "audi" aratir
    But kullanici 2 saniye bekler
    And google sayfasinda basligin "audi" icerdigini test eder
    And sayfayi kapatir

        #String kullanimda " " cift tirnak ile parametreli method olusturuyoruz.
        #Numeric kullanimda yani sayfayi x saniye bekler gibi kullanimlarda da sayi belirttigimiz zaman
          #int olarak parametreli bir method olusturur. Bunu feature file'da belirtme sebebimiz step definition icinde
          #yaptigimiz beklemeyi stepleri okuyan kisi yada dev. bunu bilmez ama bilmesi gerekiyorsa feature file'da
          #bunu direkt görür ve webelemente ulasilmasi icin bekleme koyuldugunu anlamis olur.


