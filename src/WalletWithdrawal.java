public class WalletWithdrawal {
    public static void main(String[] agrs){
        String userName = "Haauen";
        float balance = 100.0f;
        float withdraw = 101.0f;
        System.out.printf("____WELCOME %s____" , userName);
        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.printf("\nWithdrawal successful : %.2f\nAvailable balance : %.2f" ,
                    withdraw, balance);
        } else {
            System.out.printf("\nInsufficient balance\nAvailable balance %.2f" , balance);
        }
    }
}
//this program cover variable , data types , class , main method signature,
// decision / condition logic (if , else if , else) , printing statements , formats in printing