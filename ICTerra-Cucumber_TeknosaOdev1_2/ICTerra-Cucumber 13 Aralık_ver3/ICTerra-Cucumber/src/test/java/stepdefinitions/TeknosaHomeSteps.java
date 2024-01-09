package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.TeknosaHomePage;

public class TeknosaHomeSteps {
    TeknosaHomePage teknosahomePage = new TeknosaHomePage();

    @Given("Bildirimlere izin verilir")
    public void bildirimlereIzinVerilir() {
        teknosahomePage.izinVerilir();
        teknosahomePage.cerezlerKabulEdilir();

    }

    @When("teknosa sayfasında scroll ile altbaslıga gidilir")
    public void teknosaSayfasındaScrollIleAltbaslıgaGidilir() {
        teknosahomePage.scrollYapilir();
    }

    @And("Kurumsal Magazalarımıza basilir")
    public void kurumsalMagazalarımızaBasilir() {
        teknosahomePage.magazalarimizaTiklanir();
    }

    @And("Arama kutusuna Kulaklık yazilir ve entera basilir")
    public void aramaKutusunaKulaklıkYazilirVeEnteraBasilir() {
        teknosahomePage.kulaklikYazilirVeEnteraBasilir();
    }
}
