package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPage;

public class BasketSteps {

    BasketPage basketPage = new BasketPage();


    @And("Sepete gidilir")
    public void sepeteGidilir() {
        basketPage.goToBasket();
    }

    @Then("Urun sayısının {string} oldugu kontrol edilir")
    public void urunSayısınınUrunSayisiOlduguKontrolEdilir(String count) {

        basketPage.checkProductCount(count);
    }
}
