package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class CategoryPage {

    public CategoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public final By tumUrunler = By.xpath("(//div[@class='product-tile-title'])[1]");
    public final By urunlerIcon = By.xpath("//span[contains(., 'Ürünler')][1]");

    public By defaultElement;
    public void tumUrunlereGozatTiklanir() {
        Action.clickElement(tumUrunler);
    }

    public void clickSubProduct(String productName, String subProduct) throws InterruptedException {
        Action.clickElement(urunlerIcon);
        clickProductByName(productName);
        clickSubProductByName(subProduct);
    }

    public void clickProductByName(String productName){
        defaultElement = By.xpath("(//span[contains (., '" + productName + "')])[1]");
        System.out.println(defaultElement);
        Action.clickElement(defaultElement);
        defaultElement= null;
    }

    public void clickSubProductByName(String subProductName) throws InterruptedException {
        Thread.sleep(3000);
        defaultElement = By.xpath("(//span[contains (., '" + subProductName + "')])[1]/..");
        System.out.println(defaultElement);
        Action.clickElement(defaultElement);
        defaultElement= null;
    }
}
