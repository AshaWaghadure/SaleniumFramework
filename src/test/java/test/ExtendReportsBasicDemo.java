package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtendReportsBasicDemo {
    static WebDriver driver = null;

    public static void main(String[] args) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest extentTest = extent.createTest("amazon search test");

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        extentTest.log(Status.INFO,"starting Test case");
        driver.get("https://www.amazon.in/");
        extentTest.pass("navigated to amazon.com");
        driver.findElement(By.name("field-keywords")).sendKeys("automation step by step");
        extentTest.pass("Entering text into textbox");
        driver.findElement(By.id("nav-search-submit-button")).click();
        extentTest.pass("searching the text");
        driver.close();
        extentTest.pass("close the driver");
        extentTest.info("test is completed");



        ExtentTest extentTest2 = extent.createTest("amazon search test2");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        extentTest2.log(Status.INFO,"starting Test case2");
        driver.get("https://www.amazon.in/");
        extentTest2.pass("navigated to amazon.com");
        driver.findElement(By.name("field-keywords")).sendKeys("automation step by step");
        extentTest2.pass("Entering text into textbox");
        driver.findElement(By.id("nav-search-submit-button")).click();
        extentTest2.fail("searching the text");
        driver.close();
        extentTest2.pass("close the driver");
        extentTest2.info("test is completed");
        extent.flush();
    }
}
