package exceptions_learning;

public class ExceptionHandling {

    public static void main(String[] args)
    {
        try {
            int a = 5, b = 0, c;
            c = a / b;

        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Caught"+e.getMessage());
        }

        catch (Exception e)
        {
            System.out.println("Exception Caught"+e.getMessage());
        }

        finally {
            System.out.println("After catch block");
        }



    }
}
