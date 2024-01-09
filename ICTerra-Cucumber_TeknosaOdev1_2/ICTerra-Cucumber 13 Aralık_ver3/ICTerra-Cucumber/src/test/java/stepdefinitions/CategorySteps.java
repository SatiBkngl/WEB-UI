package stepdefinitions;

import io.cucumber.java.en.And;
import pages.CategoryPage;

public class CategorySteps {

    CategoryPage categoryPage = new CategoryPage();


    @And("Tüm ürünlere göz at butonuna tıklanır")
    public void tümÜrünlereGözAtButonunaTıklanır() {
        categoryPage.tumUrunlereGozatTiklanir();
    }

    @And("{string} ürünlerden {string} alt ürün secilir")
    public void urunlerÜrünlerdenAltUrunAltÜrünSecilir(String productName, String subProduct) throws InterruptedException {
        categoryPage.clickSubProduct(productName,subProduct);
    }
}
