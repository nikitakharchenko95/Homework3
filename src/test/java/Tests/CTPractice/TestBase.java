package Tests.CTPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import Util.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

   @BeforeMethod
    public void setUp(){

       Driver.getDriver().get("https://practice-cybertekschool.herokuapp.com/");
       Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       Driver.getDriver().manage().window().maximize();

   }

   @AfterMethod
    public void done(){
    Driver.closeDriver();
   }

}
