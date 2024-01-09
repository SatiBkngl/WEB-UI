package pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import static utilities.Driver.driver;

public class TeknosaUrunPage {

    public TeknosaUrunPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public static final By bluetootKulaklik = By.xpath("//div[@class=\"input checkbox\"]/input[@id=\"category0\"]");


    public static final By enCokSatanlarKategori = By.xpath("//label[@for='bestSellerPoint-desc']");
    public static final By ilkUrun = By.xpath("(//a[@class=' prd-link '])[1]");

    public static final By sepeteEkleButonu = By.xpath("//button[@id='addToCartButton']");

    public static final By fiyatKarsilastir = By.xpath("//button[@class=\"btn-compare\"]");

    public static final By alisverisDevam = By.xpath("//a[@href='javascript:parent.$.colorbox.close()']");

    public static final By sonUrun = By.xpath("(//a[@class=' prd-link '])[20]");


    public static final By sepetimeGitt= By.xpath("//div[@class=\"mnp-footer\"]//a[@class=\"btn btn-primary\"]/span");


    public static final By alisverisTamam = By.xpath("//a[@href=\"/sepet/checkout\"]");


    public static final By uyeOlmadanAl = By.xpath("//a[@class=\"btn btn-outline-dark button-guestForm\"]");


    public static final By emailYaz = By.xpath("//input[@id=\"guest.email\"]");

    public static void bluetootKulaklikIsaretlenir() throws InterruptedException {
              Action.checkBoxClick(bluetootKulaklik);
       }

    public static void ilkUrunTikla() {
        Action.clickElement(ilkUrun);

    }
    public static void enCokSatanlar() throws InterruptedException {
             Action.clickElement(enCokSatanlarKategori);
    }


    public static void sepeteEkleTikla() throws InterruptedException {
        Action.scrollUntilVisible(sepeteEkleButonu);
        Thread.sleep(1000);
        Action.scrollUntilVisible(fiyatKarsilastir);
        Action.clickElement(sepeteEkleButonu);
    }

    public static void alisverisDevamEt() throws InterruptedException {
        Thread.sleep(1000);
        Action.clickElement(alisverisDevam);
    }

    public static void oncekiSayfayaDon() {
       driver.navigate().back();
    }

    public static void sonUrun() throws InterruptedException {
        Action.scrollUntilVisible(sonUrun);
        Thread.sleep(1000);
        Action.clickElement(sonUrun);
    }

    public static void sepetimeGit() {
        Action.clickElement(sepetimeGitt);
    }

    public static void alisverisTamamla() {
        Action.clickElement(alisverisTamam);
    }

    public static void uyeOlmadanSec() {
        Action.clickElement(uyeOlmadanAl);
    }

    public static void emailYaz() {
        Action.clickElement(emailYaz);
        Action.sendKeysElement(emailYaz, "sati.bakanoglu@icterra.com");
    }
}
