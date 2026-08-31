package Classwork.Aug28.Class;

class BankAccount{
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0 ) {
            balance += amount;
            System.out.printf("Deposit of amount %.2f\n" , amount);
        }
        else System.out.println("Enter amount greater than 0");
    }
    public void withdrawl(double amount){
        if(amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawl of amount %.2f is successful\n" ,amount);
        }
        else System.out.println("Insufficient balance");
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ram" , 50000);
        account1.deposit(200);
        account1.withdrawl(2000);
    }
}
