package pages;

import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import static utilities.Driver.driver;

public class TeknosaHomePage {

    public TeknosaHomePage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public final By tamamButonu = By.xpath("//div[@id='ins-editable-button-1580496494']");

    public final By magazalarim = By.xpath("(//a[@href='/magaza-bul'])[3]");

    public final By aramaAlani = By.xpath("//input[@id='search-input']");
    public void izinVerilir() {
        Action.clickElement(tamamButonu);
    }

    public void scrollYapilir() {
        Action.scrollUntilVisible(magazalarim);
    }

    public void magazalarimizaTiklanir() {
        Action.pressEnter(magazalarim);
    }

    public void cerezlerKabulEdilir() {
        Shadow shadow = new Shadow(driver);
        shadow.findElementByXPath(("//*[.='Kabul Et']")).click();
    }

    public void kulaklikYazilirVeEnteraBasilir() {
        Action.sendKeysElement(aramaAlani,"Kulaklık");
        Action.pressEnter(aramaAlani);
    }
}
