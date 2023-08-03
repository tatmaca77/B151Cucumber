Feature: US002 BlueRentalCar Login Islemi

  Scenario: TC01 BluRentalCar Positive Test
    Given kullanici "blueRentalUrl" sayfasina gitti
    And kullanici verilen kullanici bilgileri ile login olur
      | email | password |
      | mail1 | sifre1   |
      | mail2 | sifre2   |
    And sayfayi kapatir