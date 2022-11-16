import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class DesiredCapabilitiesDemo {

   static WebDriver driver;


    public static void main(String[] args)
    {


        ChromeOptions options = new ChromeOptions();
       // options.setExperimentalOption("useAutomationExtension", false);
       // options.setExperimentalOption("excludeSwitches",
                //Collections.singletonList("enable-automation"));
        options.addArguments("disable-infobars");

        String projectPath=System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
        //driver1=new ChromeDriver(options);

         driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.name("field-keywords")).sendKeys("automation step by step");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.close();

    }
}
