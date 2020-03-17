package Tests.CTPractice;
import Pages.*;
import Util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CTprac extends TestBase {
    @Test
    public void TC1(){
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.registrationForm.click();
        RegistrationForm r1= new RegistrationForm();
        r1.dob.sendKeys("wrong_dob", Keys.ENTER);
        Assert.assertTrue(r1.wrongDOBwarning.isDisplayed());
    }
    @Test
    public void TC2(){
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.registrationForm.click();
        RegistrationForm r1= new RegistrationForm();
        Assert.assertTrue(r1.cCheckbox.isDisplayed()&&r1.cLabel.isDisplayed());
        Assert.assertTrue(r1.javaCheckBox.isDisplayed()&&r1.javaLabel.isDisplayed());
        Assert.assertTrue(r1.JSCheckBox.isDisplayed()&&r1.JSLabel.isDisplayed());
    }
    @Test
    public void TC3(){
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.registrationForm.click();
        RegistrationForm r1= new RegistrationForm();
        r1.firstName.sendKeys("a");
        Assert.assertTrue(r1.invalidFirstNameWarning.isDisplayed());

    }
    @Test
    public void TC4(){
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.registrationForm.click();
        RegistrationForm r1= new RegistrationForm();
        r1.lastName.sendKeys("a");
        Assert.assertTrue(r1.invalidLastNameWarning.isDisplayed());
    }
    @Test
    public void TC5(){
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.registrationForm.click();
        RegistrationForm r1= new RegistrationForm();
        r1.validLogIn();
        Assert.assertTrue(r1.confirmationMessege.isDisplayed());
    }
    @Test
    public void TC6() {
        Driver.getDriver().get("https://www.tempmailaddress.com/");
        TempMail t1 = new TempMail();
        String email = t1.email.getText();
        Driver.getDriver().navigate().back();
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.signUpForMail.click();
        SignUpForMail s1 = new SignUpForMail();
        s1.fullName.sendKeys("Brad Fot");
        s1.email.sendKeys(email);
        s1.signUpBTN.click();
        String expected1 = "Thank you for signing up. Click the button below to return to the home page.";
        Assert.assertEquals(s1.confMes.getText(), expected1);

        Driver.getDriver().get("https://www.tempmailaddress.com/");

        String expected2 =" do-not-reply@practice.cybertekschool.com";
        Assert.assertEquals(t1.emailFrom.getText(), expected2);
        t1.emailFrom.click();
        String expected3 = "do-not-reply@practice.cybertekschool.com";
        String expected4 ="Thanks for subscribing to practice.cybertekschool.com!";
        Assert.assertEquals(t1.emailFrom2.getText(), expected3);
        Assert.assertEquals(t1.subject.getText(), expected4);

    }

    @Test
    public void TC7(){
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.fileUpload.click();
        FileUpload f1 = new FileUpload();
        f1.chooseFile.sendKeys("/Users/mykytakharchenko/IdeaProjects/Homework3/testcase7.txt");
        f1.uploasdBtn.click();
        String expected = "testcase7.txt";
        Assert.assertTrue(f1.confMes.isDisplayed());
        Assert.assertEquals(f1.fileName.getText(), expected);

    }
    @Test
    public void TC8(){
        PracticeCyberTek p1 = new PracticeCyberTek();
        p1.autoComplete.click();
        AutoComplete a1 = new AutoComplete();
        a1.countryInput.sendKeys("United States of America");
        a1.submitBTN.click();
        String expected = "You selected: United States of America";
        Assert.assertEquals(a1.confMes.getText(), expected);

    }


    @Test(dataProvider = "tc9_12")
    public void TC9_12(String c, String mes){
    PracticeCyberTek p1 = new PracticeCyberTek();
    p1.statusCode.click();
    StatusCode s1 = new StatusCode();
    Driver.getDriver().findElement(By.linkText(c)).click();
    Assert.assertTrue(s1.codeConfirmationMes.getText().contains(mes));

    }

    @DataProvider(name = "tc9_12")
    public Object[][] tcdp(){

        return new Object[][]{
                {"200", "This page returned a 200 status code"},
                {"301", "This page returned a 301 status code"},
                {"404", "This page returned a 404 status code"},
                {"500", "This page returned a 500 status code"}
        };
    }
}
