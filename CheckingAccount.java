public class CheckingAccount extends Exception {
    
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
     }
     
     public void deposit(double amount) {
        balance += amount;
     }

     public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
           balance -= amount;
        }else {
           double less = amount - balance;
           throw new InsufficientFundsException(less);
        }
     }

     public double getBalance() {
        return balance;
     }
     
     public int getNumber() {
        return number;
     }

}
