package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpForMail {

    public SignUpForMail(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[name='full_name']")
    public WebElement fullName;
    @FindBy(css = "[name='email']")
    public WebElement email;
    @FindBy(css = "[name='wooden_spoon']")
    public WebElement signUpBTN;
    @FindBy(tagName = "h3")
    public WebElement confMes;

}
