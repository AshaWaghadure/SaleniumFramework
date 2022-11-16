package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonSearchPage;


public class AmazonPageSearch {
   static WebDriver driver=null;
    public static void main(String[] args) {
        googleSearch();

    }
    public static void googleSearch(){
        String projectPath=System.getProperty("user.dir");
        System.out.println(projectPath);

        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
         driver=new ChromeDriver();
        //goto google.com
         driver.get("https://www.amazon.in/");
        AmazonSearchPage.textbox_search(driver).sendKeys("baby gilrs dress");
        //AmazonSearchPage.button_search(driver).click();
        AmazonSearchPage.button_search(driver).sendKeys(Keys.RETURN);

        //enter text into textbox
      //  driver.findElement(By.name("q")).sendKeys;
        //click on search button
      // driver.findElement(By.name("btnK")).click();
        //driver.findElement(By.name("btnK"));


        //driver.findElement(By.name("btnI")).sendKeys(Keys.RETURN);
        // close driver
        driver.close();
        System.out.printf("test completed successfully");
    }
}
