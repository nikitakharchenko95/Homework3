package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Util.Driver;

public class PracticeCyberTek {

    public PracticeCyberTek (){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='Registration Form']")
    public  WebElement registrationForm;

    @FindBy(css = "[href='/upload']")
    public WebElement fileUpload;
    @FindBy (css = "[href='/autocomplete']")
    public WebElement autoComplete;
    @FindBy(xpath = "//a[text()='Status Codes']")
    public WebElement statusCode;
    @FindBy(xpath = "//a[text()='Sign Up For Mailing List']")
    public WebElement signUpForMail;

}
