package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='pass']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement loginButton;

    @FindBy (className = "_9ay7")
    public WebElement girisYapilamadiYazisi;


}
