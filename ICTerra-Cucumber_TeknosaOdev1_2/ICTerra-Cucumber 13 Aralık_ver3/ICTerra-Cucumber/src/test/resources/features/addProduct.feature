@Product
Feature: Kategoriden sepete ürün ekleme

  Scenario Outline: Kategoriden sepete ürün ekleme
    Given Cerezler kabul edilir
    And <Urunler> ürünlerden <AltUrun> alt ürün secilir
    And Tüm ürünlere göz at butonuna tıklanır
    And İlk ürün sepete eklenir
    Then Urun sayısının <UrunSayisi> oldugu kontrol edilir

    Examples:
      | Urunler                              | AltUrun                                   | UrunSayisi |
      | "Buzdolapları ve Derin Dondurucular" | "Solo Buzdolapları ve Derin Dondurucular" | "1"        |

