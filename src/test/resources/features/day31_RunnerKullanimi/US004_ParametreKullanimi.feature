Feature: US004 TechProEducation Arama Testi

  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici "https://techproeducation.com" sayfasina gider

  Scenario: TC01 Sayfada Arama Yapar
    Then arama kutusunda "mobile" aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin Mobile icerdigini test eder

  Scenario: TC02 Sayfada Arama Yapar
    Then arama kutusunda "qa" aratir

  Scenario: TC03 Sayfada Arama Yapar
    Then arama kutusunda "java" aratir
    And sayfayi kapatir
#Parametreli method kullanimi icin file da "" icine aramak istedigimiz kelimeyi yazariz.
    # Daha sonra step definition da bir tane parametreli method olusturur.
  #Parametreli bir method olusturdugu icin file sadece istedigimiz kelimeyi degistirerek bunu birden fazla kez kullanabiliriz