package pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class ProductPage {

    public ProductPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public final By firstProduct = By.xpath("(//div[@class='o-producttilerebrush js-o-producttilerebrush'])[1]");
    public final By sepeteEkleButonu = By.xpath("(//span[contains (., 'Sepete ekle')])[1]");


    public void clickFirstProduct() {
        Action.clickElement(firstProduct);
    }

    public void addToFirstProduct() {
        Action.clickElement(sepeteEkleButonu);
    }
}
