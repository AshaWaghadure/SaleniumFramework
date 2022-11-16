import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrowserTest {


    public static void main(String[] args) throws InterruptedException {
       String projectPath=System.getProperty("user.dir");
       System.out.println(projectPath);

     System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       //driver.get("https://google.com/");
        driver.get("https://www.amazon.in/");

       // WebElement texbox=driver.findElement(By.className("gLFyf gsfi"));



        WebElement texbox=driver.findElement(By.id("twotabsearchtextbox"));
       List<WebElement> listofweb= driver.findElements(By.id("twotabsearchtextbox"));

        int count= listofweb.size();
        System.out.println("count is: "+count);
       texbox.sendKeys("smart watch");



      //texbox.sendKeys("hi");
       //texbox.click();
        //texbox.clear();
        Thread.sleep(3000);
        driver.close();
        //driver.quit();
    }
}
