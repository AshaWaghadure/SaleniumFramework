package demo;

import java.sql.SQLOutput;

public class ExceptionHandlingDemo {
    public static void main(String[] args) throws Exception {
        demo();

    }

    public static void demo() throws Exception {

        System.out.println("hello world");
        throw new ArithmeticException("divide by zero");
        //int i = 1 / 0;

      //  System.out.println("completed");
    }
}

/*  try
            System.out.println("hello world");
            int i=1/0;
            System.out.println("completed");
        }
        catch(Exception exp){
            System.out.println("Insode catch block");
            System.out.println("message is "+exp.getMessage());
            System.out.println("cause is "+exp.getCause());
           // exp.printStackTrace();

        }
        finally {
            System.out.println("Inside finally block");
        }

 */



