package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeAmazonPage {
    public PracticeAmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    public WebElement signinButton;

    @FindBy (xpath = "//*[@id='ap_email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy (xpath = "//*[.='There was a problem']")
    public WebElement problemMessage;

    @FindBy (className = "a-expander-prompt")
    public WebElement needHelpLink;

    @FindBy (id = "auth-fpp-link-bottom")
    public WebElement forgotPasswordLink;

    @FindBy (xpath = "//h1")
    public WebElement passwordAssistanceText;

    @FindBy (id = "createAccountSubmit")
    public WebElement createYourAccountButton;

    @FindBy (xpath = "//h1")
    public WebElement createAccountText;

}
