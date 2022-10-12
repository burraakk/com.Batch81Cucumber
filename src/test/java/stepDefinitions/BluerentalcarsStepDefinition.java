package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BluerentalcarsPage;
import utilities.Driver;

public class BluerentalcarsStepDefinition {
    BluerentalcarsPage bluerentalcarsPage = new BluerentalcarsPage();
    @Then("Kullanici Login yazisina tiklar")
    public void kullaniciLoginYazisinaTiklar() {
        bluerentalcarsPage.loginButtonHomePage.click();
    }

    @And("Kullanici {string} username girer")
    public void kullaniciUsernameGirer(String username) {
        bluerentalcarsPage.emailBox.sendKeys(username);
    }

    @And("Kullanici {string} password girer")
    public void kullaniciPasswordGirer(String password) {
        bluerentalcarsPage.passwordBox.sendKeys(password);
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        bluerentalcarsPage.loginButtonLoginPage.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(bluerentalcarsPage.loginButtonLoginPage.isDisplayed());
    }

    @Given("kullanici brc sayfasina gider")
    public void kullaniciBrcSayfasinaGider() {
        Driver.getDriver().get("https://www.bluerentalcars.com/");
    }
}
