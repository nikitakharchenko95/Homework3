package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Util.Driver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {
    public RegistrationForm(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(css = "[name='birthday']")
    public WebElement dob;
    @FindBy(xpath = "//small[text()='The date of birth is not valid']")
    public WebElement wrongDOBwarning;
    @FindBy(id = "inlineCheckbox1")
    public WebElement cCheckbox;
    @FindBy(xpath = "//div[@class='form-check form-check-inline'][1]/label")
    public WebElement cLabel;
    @FindBy(id = "inlineCheckbox2")
    public WebElement javaCheckBox;
    @FindBy(xpath = "//div[@class='form-check form-check-inline'][2]/label")
    public WebElement javaLabel;
    @FindBy(id = "inlineCheckbox3")
    public WebElement JSCheckBox;
    @FindBy(xpath = "//div[@class='form-check form-check-inline'][3]/label")
    public WebElement JSLabel;
    @FindBy(css = "[name='firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//small[text()='first name must be more than 2 and less than 64 characters long']")
    public WebElement invalidFirstNameWarning;
    @FindBy(css = "[name='lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//small[text()='The last name must be more than 2 and less than 64 characters long']")
    public WebElement invalidLastNameWarning;
    @FindBy(css = "[name='username']")
    public WebElement userName;
    @FindBy(css = "[name='email']")
    public WebElement email;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(css = "[name='phone']")
    public WebElement phoneNumber;
    @FindBy(css = "[value='male']")
    public WebElement maleGender;
    @FindBy(css = "[value='female']")
    public WebElement femaleGender;
    @FindBy(css = "[value='other']")
    public WebElement otherGender;
    @FindBy(css = "[name='department']")
    public WebElement department;

    @FindBy(css = "[name='job_title']")
    public WebElement jobType;

    @FindBy(id = "wooden_spoon")
    public WebElement signUpBtn;
    @FindBy(tagName = "p")
    public WebElement confirmationMessege;


    public void validLogIn(){
        firstName.sendKeys("Mykyta");
        lastName.sendKeys("Kharchenko");
        userName.sendKeys("mykkharc");
        email.sendKeys("asdf@gmd.com");
        password.sendKeys("2343erfd");
        phoneNumber.sendKeys("234-245-3345");
        maleGender.click();
        dob.sendKeys("12/11/1999");
        new Select(department).selectByIndex(2);
        new Select(jobType).selectByIndex(2);
        javaCheckBox.click();
        signUpBtn.click();

    }
}
