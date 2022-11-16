package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
    public static void main(String[] args) {
        googleSearch();

    }
    public static void googleSearch(){
        String projectPath=System.getProperty("user.dir");
        System.out.println(projectPath);

        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //goto google.com
         driver.get("http://google.com/");
        //enter text into textbox
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        //click on search button
      // driver.findElement(By.name("btnK")).click();
        driver.findElement(By.name("btnK"));


        //driver.findElement(By.name("btnI")).sendKeys(Keys.RETURN);
        // close driver
        driver.close();
        System.out.printf("test completed successfully");
    }
}
