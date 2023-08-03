Feature: US001 Google Sayfasinda Urun Aramasi

  Scenario: TC01 Arama Kutusunda Verilen Urunler Aratilir
    Given kullanici "googleUrl" sayfasina gitti
    Then kullanici data tableda verilen bilgileri aratir
      | Datalar  |
      | samsung  |
      | nokia    |
      | apple    |
      | motorola |
    And sayfayi kapatir

   # AltGr + <> basarak --> bu sembole ulasisiriz |

  #DataTable Scenario Outline daki gibi birden fazla veriyi ayni scenario'da test etmek icin kullanilir.
  #Scenario Outline'dan farkli olarak verilerle ilgili tablolari istedigimiz stepten sonra kendimiz olusturabiliriz.
  #Tabloyu olusturdugumuz step'in method'una parametre olarak cucumber.io dan DataTable parametresini ekleriz.
  #Bu parametre sayesinde olusturmus oldugumuz tabloyu bir list'e dönüstürüp loop ile verileri kullanabiliriz.
  #Birden fazla sütun olusturduysak yine DataTable parametresi sayesinde excel'den bildigimiz row() methodu ile
  #bu datalara ulasabiliriz.