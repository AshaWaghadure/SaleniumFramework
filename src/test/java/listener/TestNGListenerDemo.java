package listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listener.TestngListener.class)
public class TestNGListenerDemo {


    @Test
    public void test1(){
        System.out.println("Inside test 1");
    }
    @Test
    public void test2(){
        System.out.println("Inside test 2");
       // Assert.assertTrue(false);

        String projectPath=System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
        //driver1=new ChromeDriver(options);

       WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.name("field-keywords")).sendKeys("automation step by step");
        driver.findElement(By.name("field-keyword")).sendKeys("automation step by step");

        driver.close();
    }
    @Test
    public void test3(){
        System.out.println("Inside test 3");
        throw new SkipException("skipped");
    }

}
