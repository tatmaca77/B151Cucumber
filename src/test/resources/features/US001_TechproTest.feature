Feature: US001 TechProEducation Sayfasi Testi
  Scenario: TC01 Sayfada Arama Yapma
    Given kullanici techpro sayfasina gider
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir