package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static  WebDriver driver;

    public  static WebDriver getDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            /**
             * more browsers will be added
             */
        }
        return driver;
    }
public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
}
}
