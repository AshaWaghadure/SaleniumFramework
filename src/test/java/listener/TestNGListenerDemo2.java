package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(listener.TestngListener.class)
public class TestNGListenerDemo2 {


    @Test
    public void test4() {
        System.out.println("Inside test 4");
    }
    @Test
    public void test5(){
        System.out.println("Inside test 5");
       // Assert.assertTrue(false);
    }
    @Test
    public void test6(){
        System.out.println("Inside test 6");
        throw new SkipException("skipped");
    }

}
