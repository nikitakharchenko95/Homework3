package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload {


    public FileUpload(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "file-upload")
    public WebElement chooseFile;
    @FindBy(id = "file-submit")
    public WebElement uploasdBtn;
    @FindBy (tagName = "h3")
    public WebElement confMes;
    @FindBy(id = "uploaded-files")
    public WebElement fileName;

}
