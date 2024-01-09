package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TeknosaMagazaBulPage;

import java.io.IOException;

public class TeknosaMagazaBulSteps {

    TeknosaMagazaBulPage teknosamagazabulpage = new TeknosaMagazaBulPage();
    
    @And("Magaza Bulucu formundan <il adı> seçimi yapılır")
    public void magazaIlAdiSecimiYapilir() throws InterruptedException {
        TeknosaMagazaBulPage.ilAdiSecilir();
           }
    @And("Magaza Bulucu formundan <ilce adı> seçimi yapılır")
    public void magazaIlceAdiSecimiYapilir() throws InterruptedException {
        TeknosaMagazaBulPage.ilceAdiSecilir();
    }

    @And("Magazalar dosyaya yazdırılır")
    public void magazalarDosyayaYazdırılır() throws IOException, InterruptedException {
        TeknosaMagazaBulPage.antalyaMagazalar();
    }
}
