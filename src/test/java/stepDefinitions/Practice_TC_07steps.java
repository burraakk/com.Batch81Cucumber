package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Practice_TC07_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07steps {

    Practice_TC07_Page practiceTc07Page = new Practice_TC07_Page();
    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyi_baslatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void ana_sayfanin_basariyla_gorunur_oldugunu_dogrulayin() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());
    }
    @Then("Test Case buttonu na tiklayin")
    public void test_case_buttonu_na_tiklayin() {
        practiceTc07Page.testCaseLink.click();
    }
    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrulayin() {
        Assert.assertTrue(practiceTc07Page.testCaseTitle.isDisplayed());
    }
    @Then("İlgili sayfanin ekran goruntusunu alin")
    public void ilgili_sayfanin_ekran_goruntusunu_alin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
