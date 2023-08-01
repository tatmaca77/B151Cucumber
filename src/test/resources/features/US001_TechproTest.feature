Feature: US001 TechProEducation Sayfasi Testi
  Scenario: TC01 Sayfada Arama Yapma
    Given kullanici techpro sayfasina gider
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir
# Feature file da daha önce olusturdugumuz bir method'u baska Scenario'larda tekrar olusturmadan kullanabiliriz.
# Yukaridaki örnekte oldugu gibi sayfayi kapatir step'i icin daha önce amazonstepdefinition class'inda olusturdugumuz
  # methodu kullanabiliriz.
