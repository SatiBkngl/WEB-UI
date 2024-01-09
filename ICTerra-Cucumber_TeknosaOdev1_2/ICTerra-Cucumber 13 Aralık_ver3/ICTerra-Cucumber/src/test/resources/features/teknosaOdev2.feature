@teknosa2
Feature: AltUrun secme ve  sepete ekleme

  Scenario: AltUrunleri secme ve sepete ekleme
    Given Bildirimlere izin verilir
    And Arama kutusuna Kulaklık yazilir ve entera basilir
    And Alt Kategorilerden Bluetooth Kulaklık secilir
    And En Çok Satanlar filtresi tiklanir
    And Ilk sayfadaki birinci urun tiklanir
    And Sepete Ekle tiklanir
    And Alışverişe Devam Et tiklanir
    And Onceki sayfaya geri dönülür
    And Ilk sayfadaki sonuncu urun tiklanir
    And Sepete Ekle tiklanir
    And Sepetime Gite tiklanir
#    And En ucuzunun adedi artirilir
    And Alışverişi Tamamla tiklanir
    And Üye Olmadan Devam Et butonuna tiklanir
    And e-posta adresi girilir