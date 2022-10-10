package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @Then("Kullanici Nutella aratir")
    public void kullaniciNutellaAratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }

    @And("Sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr= amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium", Keys.ENTER);

    }

    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        AmazonPage amazonPage = new AmazonPage();
        String arananKelime="Selenium";
        String actualAramaSonucStr= amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("Kullanici Iphone aratir")
    public void kullaniciIphoneAratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

    }

    @And("Sonuclarin Iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        AmazonPage amazonPage = new AmazonPage();
        String arananKelime="Iphone";
        String actualAramaSonucStr= amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("Kullanici {string} aratir")
    public void kullaniciAratir(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("Sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucStr= amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @Then("URL'in {string} icerdigini test edin")
    public void urlInIcerdiginiTestEdin(String arananUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananUrl));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
