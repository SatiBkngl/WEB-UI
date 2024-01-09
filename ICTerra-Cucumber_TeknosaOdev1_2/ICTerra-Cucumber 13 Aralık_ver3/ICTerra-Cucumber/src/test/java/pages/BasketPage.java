package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class BasketPage {

    public BasketPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public final By sepetButonu = By.xpath("//i[@class='icon icon-m icon-shoppingcart']");
    public final By productCount = By.xpath("//span[@class='count-indicator']");
    public void goToBasket() {
        Action.clickElement(sepetButonu);
    }

    public void checkProductCount(String count) {

        Action.checkElementText(productCount,count);
    }
}
