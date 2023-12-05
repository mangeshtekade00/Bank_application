public class NoBank implements RBI{
    private String userName;
    private Integer accountNo;
    private String password;
    public static double rateOfInterest = 8.5;
    public static int minimunBalance = 5000;
private Integer balance;
    public NoBank(String userName, String password , Integer balance) {
        this.userName = userName;
        this.password = password;
        this.accountNo= 101;
        this.balance = balance;
    }

    public String addMoney(int money, String password) {
       if(password.equals(this.password)){
           balance = balance+money;

           return "Money has been added, new balance is"+balance;
       }
       else {
           return "Password is incorrect";
       }

    }

    public String withdrawMoney(int money, String password) {
       if(password.equals(this.password)){
           int remainingMoney = balance-money;
           if(remainingMoney>5000){
               balance = balance-money;
               return "Money has been withdraw, new balance is"+balance;
           }
           else {
               return" Minimum balance criteria is not supported";
           }
       }
       else {
            return "Correct your password";
       }
    }

    public int checkBalance(String password) {
        if(password.equals(this.password)){
            return balance;
        }
        else
        return -1;
    }

    public double calculateInterest(int years) {

       double totalInterest = (balance*NoBank.rateOfInterest*years) / 100;
        return totalInterest;
    }
}
