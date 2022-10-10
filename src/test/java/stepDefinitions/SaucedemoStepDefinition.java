package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SaucedemoStepDefinition {
    SaucedemoPage saucedemoPage = new SaucedemoPage();

    @Given("Navigate to Saucedemo Website")
    public void navigateToSaucedemoWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));
    }

    @Then("Enter the correct username")
    public void enterTheCorrectUsername() {
        saucedemoPage.usernameBox.sendKeys(ConfigReader.getProperty("saucedemoUsername"));
    }

    @Then("Enter the correct password")
    public void enterTheCorrectPassword() {
        saucedemoPage.passwordBox.sendKeys(ConfigReader.getProperty("saucedemoPassword"));
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        saucedemoPage.loginButton.click();
    }

    @And("Choose price low to high")
    public void choosePriceLowToHigh() {
        Select select = new Select(saucedemoPage.productPageDDM);
        select.selectByVisibleText("Price (high to low)");
    }

    @And("Verify that PRICE \\(LOW TO HIGH) is visible")
    public void verifyThatPRICELOWTOHIGHIsVisible() {
        Select select = new Select(saucedemoPage.productPageDDM);
        Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
    }

    @And("Close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
}
