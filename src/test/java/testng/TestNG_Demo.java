package testng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_Demo {
  public   WebDriver driver;
    public String url="https://www.amazon.in/";



    String projectPath = System.getProperty("user.dir");
    // System.out.println(projectPath);





    @Test
    public  void amazonSearch() {

        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        //goto google.com
        driver.get(url);
        //enter text into textbox
        driver.findElement(By.name("field-keywords")).sendKeys("Automation step by step");
        //click on search button
        driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.RETURN);
        // driver.findElement(By.name("btnK"));


        //driver.findElement(By.name("btnI")).sendKeys(Keys.RETURN);
        driver.close();

    }


}
