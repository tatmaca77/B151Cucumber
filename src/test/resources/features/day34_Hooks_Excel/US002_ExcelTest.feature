Feature: US002 BlueRentalCar Excel Login
  Scenario: TC01 Pozitif Login Testi
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    But kullanici 2 saniye bekler
    And kullanici excel'deki "customer_info" sayfasindaki bilgiler ile giris yapip giris yapildigini test eder
    And sayfayi kapatir


  Scenario: TC02 Pozitif Login Testi
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    But kullanici 2 saniye bekler
    And kullanici excel'deki "admin_info" sayfasindaki bilgiler ile giris yapip giris yapildigini test eder
    And sayfayi kapatir