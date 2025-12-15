package exceptions_learning;


// Step1: Create custom exception

class InsufficientBalanceException extends Exception{

  public  InsufficientBalanceException(String message)
    {
        super(message);
    }

}

// Step2: Use custom exception

class BankService{

    public  void withdraw(int balance,int withdrawAmt) throws InsufficientBalanceException
    {
        if(withdrawAmt>balance)
        {
            throw new InsufficientBalanceException("Insufficient Balance!!");
        }
        System.out.println("Withdraw is successful");
    }

}

//Step: Create main class

public class CustomExceptionHandling {

    public static void main(String[] args)
    {

        BankService bankService=new BankService();
        try {
            bankService.withdraw(50000, 70000);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println("Custom Exception: "+e.getMessage());
        }
    }
}
