import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(101);
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the amount to Deposit: ");
            double amount = scan.nextDouble();
            account.deposit(amount);

            try{
                System.out.print("Enter the amount to Withdraw: ");
                double amounty = scan.nextDouble();
                account.withdraw(amounty);

                if(amounty < amount){
                    System.out.print("The Balance after Withdrawal is: $" + account.getBalance());
                }
               

            }catch(InsufficientFundsException e){
                System.out.println("Sorry, but your account is short by: $" + e.getAmount());
                e.printStackTrace();
            }
        }
       
    }
}
