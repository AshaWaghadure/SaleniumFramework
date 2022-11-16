package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonSearchPageObject;

public class AmazonSearchPageTest {
   static WebDriver driver=null;
    public static void main(String[] args) {
       amazonSearchTest();
    }
    public static void amazonSearchTest(){
        String projectPath=System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
        driver=new ChromeDriver();
        AmazonSearchPageObject searchPageObj=new AmazonSearchPageObject(driver);
        driver.get("https://www.amazon.in/");

        searchPageObj.setTextInSearchBox("A B C D");
        searchPageObj.clickSearchbutton();
        driver.close();
    }
}
