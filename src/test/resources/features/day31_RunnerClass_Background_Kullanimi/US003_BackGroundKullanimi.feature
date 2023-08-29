@tech
Feature: US003 TechProEducation Sayfasi Testi

  #Feature file icinde Scenario'larda ortak kullanilan step'lerde Background: yapisini kullanabiliriz.
  #Her scenario'dan önce buradaki step calisir sonra scenario'daki step'ler calismaya devam eder. Yani "Ortak Adimlar"
  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici techpro sayfasina gider

  Scenario: TC01 Sayfada Arama Yapma
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder

# Feature file da daha önce olusturdugumuz bir method'u baska Scenario'larda tekrar olusturmadan kullanabiliriz.
# Yukaridaki örnekte oldugu gibi sayfayi kapatir step'i icin daha önce amazonstepdefinition class'inda olusturdugumuz
  # methodu kullanabiliriz.

  Scenario: TC02 Sayfada Arama Yapar
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder


  Scenario: TC03 Sayfada Arama Yapar
    Then arama kutusunda mobile aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin Mobile icerdigini test eder
    And sayfayi kapatir

    # Featurelarin istedigimiz siraya gore veya alfabetik olarak calismasini istiyorsak file larin basina a b c vs gibi koyabiliriz
  #Scenario'larimizin tek bir browser da calismasini istersek ve tüm scenario'lardan sonra browser'i kapatmak istersek
  #en son scenario'da close yapabiliriz.


  #Github - Settings -Applications - Authorized OAuth Apps - Cucumber Reports  --> GitHubda raporu görünütlemek icin adimlar.