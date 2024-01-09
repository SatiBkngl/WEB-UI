package pages;

import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public final By searchIcon = By.xpath("//em[@class='icon icon-search icon-m']");
    public final By searchInput = By.xpath("//input[@type='search']");
    public final By searchHeading = By.xpath("(//h2[@class='a-heading'])[1]");

/*    public void searchYapilir() {
        Action.clickElement(searchIcon);
        Action.sendKeysElement(searchInput, "Kurutma Makinesi");
        Action.pressEnter(searchInput);
    }

    public void kontroluYapilir() {
        String sonuc = Action.getTextElement(searchHeading);
        System.out.println(sonuc);
        Assert.assertTrue("Search işlemi başarısızdır!!!",sonuc.contains("Kurutma Makinesi"));
    }

    public void bulasikMakinesiAraması() {
        Action.clickElement(searchIcon);
        Action.sendKeysElement(searchInput, "Bulaşık Makinesi");
        Action.pressEnter(searchInput);
    }*/
    public void clickSearchButton() {
        Action.clickElement(searchIcon);
    }

    public void sendKeysToSearchArea(String key) {
        Action.sendKeysElement(searchInput,key);
        Action.pressEnter(searchInput);
    }

    public void searchHeadingCheck(String searchText) {
        String text = "\"" + searchText + "\" için arama sonuçları";
        Action.checkElementText(searchHeading, text);
    }


}
