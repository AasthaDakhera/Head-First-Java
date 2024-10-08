//Page 434

public class TestExceptions {
    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
    }
}
class ScaryException extends Exception {
}

//Output when test="no" :
//start try
//start risky
//end risky
//end try
//finally
//end of main

//Output when test="yes" :
//start try
//start risky
//scary exception
//finally
//end of main