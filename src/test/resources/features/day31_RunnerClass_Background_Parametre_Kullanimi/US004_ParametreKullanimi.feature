#Scenario'larda birden fazla url'e gitmek istedigimizde yada birden fazla ürürn aratmak istedigimizde her step icin
  #yeniden method olusturmak yerine gitmek istedigimiz url yada aratmak istedigimiz ürünü stepleri yazarken " " tirnak
  #icine alirsak stepDefinition Class'inda parametreli bir method olusturur. Ve bu methodu diger url ve aratmak istedigimiz
  #ürünler icin direkt feature file üzerinden degistirip kullanabiliriz. Böylece tekrar tekrar her step icin method
  #olusturmamis oluruz. Asagidaki örneklerde de bunu görebilirsiniz.

Feature: US004 TechProEducation Arama Testi

  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici "https://techproeducation.com" sayfasina gider

  Scenario: TC01 Sayfada Arama Yapar
    Then arama kutusunda "mobile" aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin "Mobile" icerdigini test eder

  Scenario: TC02 Sayfada Arama Yapar
    Then arama kutusunda "qa" aratir

  Scenario: TC03 Sayfada Arama Yapar
    Then arama kutusunda "java" aratir
    And sayfayi kapatir
#Parametreli method kullanimi icin file da "" icine aramak istedigimiz kelimeyi yazariz.
    # Daha sonra step definition da bir tane parametreli method olusturur.
  #Parametreli bir method olusturdugu icin file sadece istedigimiz kelimeyi degistirerek bunu birden fazla kez kullanabiliriz

  Scenario: TC04 Sayfada Arama Yapar
    Given kullanici "https://google.com" sayfasina gider

  Scenario: TC05 Sayfada Arama Yapar
    Given kullanici "https://youtube.com" sayfasina gider

  Scenario: TC06 Sayfada Arama Yapar
    Given kullanici "https://yahoo.com" sayfasina gider