package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoComplete {
    public AutoComplete(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "myCountry")
    public WebElement countryInput;
    @FindBy(css = "[value='Submit']")
    public WebElement submitBTN;
    @FindBy(id = "result")
    public WebElement confMes;

}
