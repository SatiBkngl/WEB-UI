package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TeknosaMagazaBulPage;
import pages.TeknosaUrunPage;


//input[@id='category0']

public class TeknosaUrunSteps {

    TeknosaUrunPage teknosaUrunPage = new TeknosaUrunPage();

    @And("Alt Kategorilerden Bluetooth Kulaklık secilir")
    public void altKategorilerdenBluetoothKulaklıkSecilir() throws InterruptedException {
        TeknosaUrunPage.bluetootKulaklikIsaretlenir();
    }

    @And("Ilk sayfadaki birinci urun tiklanir")
    public void ilkSayfadakiBirinciUrunTiklanir() {
        TeknosaUrunPage.ilkUrunTikla();
    }

    @And("En Çok Satanlar filtresi tiklanir")
    public void enCokSatanlarFiltresiTiklanir() throws InterruptedException {
        TeknosaUrunPage.enCokSatanlar();
    }

    @And("Sepete Ekle tiklanir")
    public void sepeteEkleTiklanir() throws InterruptedException {
        TeknosaUrunPage.sepeteEkleTikla();
    }

    @And("Alışverişe Devam Et tiklanir")
    public void alısveriseDevamEtTiklanir() throws InterruptedException {
        TeknosaUrunPage.alisverisDevamEt();
    }

    @And("Onceki sayfaya geri dönülür")
    public void oncekiSayfayaGeriDonulur() {
        TeknosaUrunPage.oncekiSayfayaDon();
    }


    @And("Ilk sayfadaki sonuncu urun tiklanir")
    public void ilkSayfadakiSonuncuUrunTiklanir() throws InterruptedException {
        TeknosaUrunPage.sonUrun();
    }

    @And("Sepetime Gite tiklanir")
    public void sepetimeGiteTiklanir() {
        TeknosaUrunPage.sepetimeGit();
    }

    @And("Alışverişi Tamamla tiklanir")
    public void alısverisiTamamlaTiklanir() {
        TeknosaUrunPage.alisverisTamamla();
    }

    @And("Üye Olmadan Devam Et butonuna tiklanir")
    public void uyeOlmadanDevamEtButonunaTiklanir() {
        TeknosaUrunPage.uyeOlmadanSec();
    }

    @And("e-posta adresi girilir")
    public void ePostaAdresiGirilir() {
        TeknosaUrunPage.emailYaz();
    }
}
