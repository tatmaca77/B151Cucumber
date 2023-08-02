#https://editor.datatables.net adresine gidiniz
#Sayfadaki tabloda new butonuna basalım
#Çıkan pencerede verilen bilgileri girelim
#Create butonuna basalım
#Search bölümüne girdiğimiz firstname bilgisini girelim
#Başarılı bir şekilde giriş yapıldığını doğrulayalım
#Sayfayı kapatalım

Feature: US004 DataTables Testi
  Scenario Outline: TC01 DataTables Veri Girisi
    Given kullanici "https://editor.datatables.net" url sayfasina gider
    Then kullanici sayfadaki tabloda new butonuna tiklar
    And cikan pencerede verilen bilgiler girilir "<firstname>","<lastname>","<position>","<office>","<extension>","<date>","<salary>"

