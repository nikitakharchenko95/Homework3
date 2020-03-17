package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TempMail {

    public TempMail(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement emailFrom;
    @FindBy(id= "odesilatel")
    public WebElement emailFrom2;
    @FindBy(id = "predmet")
    public WebElement subject;
}
