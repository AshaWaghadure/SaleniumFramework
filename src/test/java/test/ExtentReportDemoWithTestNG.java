package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;

public class ExtentReportDemoWithTestNG {
    ExtentSparkReporter htmlReporter;
    ExtentReports extent;
    ExtentTest extentTest;
    @BeforeTest
    public void setUp(){
         htmlReporter = new ExtentSparkReporter("extent.html");
         ExtentReports extent = new ExtentReports();
       //  extent =.createInstance("extent.html");
         extent.attachReporter(htmlReporter);
        extentTest = extent.createTest("amazon search test1");

       // extent.flush();

    }
    @Test
    public void test1() throws Exception{

         extentTest.log(Status.INFO,"Usage of logs(status,detils)");
         extentTest.info("show usage of info(deatails)");
         extentTest.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("test-output").build());
         extentTest.addScreenCaptureFromPath("screenshot.png");
        // extent.flush();

    }
    @AfterTest
    public void tearDown(){

        extent.flush();
    }

}
