package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiBuradaStepDefinition {
    @Given("Kullanici {string} web sayfasina gider")
    public void kullaniciWebSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
}
