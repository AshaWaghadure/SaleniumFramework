package testng;


import org.junit.Test;
import org.testng.annotations.*;

public class TestNG_Annotation {
    @Test
    public void testCase1(){
        System.out.println("In Test Case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("In Test Case 2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("In Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("In After Method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("In Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("In After Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("In Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("In After Test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("In Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("In after Suite");
    }


}
