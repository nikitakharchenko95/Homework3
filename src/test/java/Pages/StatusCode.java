package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatusCode {

    public StatusCode(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='200']")
    public WebElement code200;
    @FindBy(xpath = "//a[text()='301']")
    public WebElement code301;
    @FindBy(xpath = "//a[text()='404']")
    public WebElement code404;
    @FindBy(xpath = "//a[text()='500']")
    public WebElement code500;
    @FindBy(tagName = "p")
    public WebElement codeConfirmationMes;

}
