package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinition {
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
        AmazonPage amazonPage = new AmazonPage();
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
}
