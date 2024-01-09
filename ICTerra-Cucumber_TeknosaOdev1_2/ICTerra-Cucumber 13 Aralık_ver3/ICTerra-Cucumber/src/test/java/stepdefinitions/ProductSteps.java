package stepdefinitions;

import io.cucumber.java.en.And;
import pages.ProductPage;

public class ProductSteps {

    ProductPage productPage = new ProductPage();


    @And("İlk ürünün detayına gidilir")
    public void ilkÜrününDetayınaGidilir() {
        productPage.clickFirstProduct();
    }

    @And("İlk ürün sepete eklenir")
    public void ilkÜrünSepeteEklenir() throws InterruptedException {
        productPage.addToFirstProduct();
        Thread.sleep(3000);
    }
}
