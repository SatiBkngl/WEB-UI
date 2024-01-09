package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();
/*
    @When("Kurutma makinesi araması yapılır")
    public void searchYapilir(){
        searchPage.searchYapilir();
    }

    @Then("Yapılan searchün kontrolü yapılır")
    public void kontroluYapilir(){
        searchPage.kontroluYapilir();
    }

    @When("Bulasik makinesi araması yapılır")
    public void bulasikMakinesiAramasıYapılır() {
        searchPage.bulasikMakinesiAraması();
    }*/

    @When("Arama ikonuna basilir")
    public void aramaIkonunaBasilir() {
        searchPage.clickSearchButton();
    }

    @And("Arama kutusuna {string} yazilir ve entera basilir")
    public void aramaKutusunaYazildiveGonderildi(String data) {

        searchPage.sendKeysToSearchArea(data);
    }

    @And("Arama sonucu basligi {string} ile kontrol edilir")
    public void aramaSonucuBasligiUrunAdiIleKontrolEdilir(String data) {

        searchPage.searchHeadingCheck(data);
    }
}
