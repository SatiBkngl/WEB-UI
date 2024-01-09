@teknosa
Feature: Magaza bulma senaryosu

  Scenario Outline: Magaza bulma ve listelenen magazaları dosyaya yazma senaryosu
    Given Bildirimlere izin verilir
     When teknosa sayfasında scroll ile altbaslıga gidilir
    And Kurumsal Magazalarımıza basilir
    And Magaza Bulucu formundan <il adı> seçimi yapılır
    And Magaza Bulucu formundan <ilce adı> seçimi yapılır
    And Magazalar dosyaya yazdırılır

    Examples:
      | ilAdi   | ilceAdi  |
      | Antalya | Manavgat |

