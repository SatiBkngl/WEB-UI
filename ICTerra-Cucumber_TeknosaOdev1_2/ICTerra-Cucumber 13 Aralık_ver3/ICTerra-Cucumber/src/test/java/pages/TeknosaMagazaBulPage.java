package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TeknosaMagazaBulPage {

    public TeknosaMagazaBulPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public static final By ilAdi = By.xpath("//select[@id='cities1']");

    public static final By ilceAdi = By.xpath("//select[@id='towns']");

    public static final By antalyaMagaza1 = By.xpath("(//div[@class='str-title'])[1]");

    public static final By antalyaMagaza2 = By.xpath("(//div[@class='str-title'])[2]");

    public static void ilAdiSecilir() throws InterruptedException {
        Action.clickElement(ilAdi);
        Thread.sleep(1000);
        Action.sendKeysElement(ilAdi, "Antalya");
        Action.pressEnter(ilAdi);
        Thread.sleep(1000);
    }

    public static void ilceAdiSecilir() throws InterruptedException {
        Action.clickElement(ilceAdi);
        Thread.sleep(1000);
        Action.sendKeysElement(ilceAdi, "Manavgat");
        Action.pressEnter(ilceAdi);
        Thread.sleep(1000);
    }


    public static void antalyaMagazalar() throws InterruptedException, IOException {
        String ilkMagazaAdi = Action.getTextElement(antalyaMagaza1);
        String ikinciMagazaAdi = Action.getTextElement(antalyaMagaza2);


        FileWriter w = new FileWriter("C:\\ICterra-Test Otomasyon\\ICTerra-Cucumber 13 Aralık_ver3\\ICTerra-Cucumber\\src\\test\\MagazaText\\AntalyaMagazalar.txt");
        BufferedWriter out = new BufferedWriter(w);
        out.write(ilkMagazaAdi); out.newLine();
        out.write(ikinciMagazaAdi); out.newLine();
        out.flush();

        System.out.println(ilkMagazaAdi);
        System.out.println(ikinciMagazaAdi);

    }
}




