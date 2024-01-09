@searchGenel
Feature: ürün arama senaryosu

  Scenario Outline: Birden Fazla ürün arama senaryosu
    Given Cerezler kabul edilir
    When Arama ikonuna basilir
    And Arama kutusuna <Urun adi> yazilir ve entera basilir
    And Arama sonucu basligi <Urun adi> ile kontrol edilir
    And İlk ürünün detayına gidilir
    Examples:
      | Urun adi |
      | "Çamaşır Makinesi" |
      | "Kurutma Makinesi" |