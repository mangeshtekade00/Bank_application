public class LotakBank implements RBI{
   private String accountHolderName;
   private String password;

   private Integer balance ;
   public static double rateOfInterest = 7.5;

    public LotakBank(String accountHolderName, String password, Integer balance) {
        this.accountHolderName= accountHolderName;
        this.password=password;
        this.balance=balance;
    }

    public LotakBank(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String addMoney(int money, String password) {
        if(password.equals(this.password)){
            balance = balance+money;

            return "Money has been added to your account, new balance is"+balance;
        }
        else {
            return "Password is incorrect";
        }
    }

    public String withdrawMoney(int money, String password) {
        if(password.equals(this.password)) {
            balance = balance - money;

            return "Money is been successfully withdrawn, new balance is" + balance;
        }
            else {
                return" Incorrect password, Try one more time";
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
        double totalInterest = (balance*LotakBank.rateOfInterest*years) / 100;
        return totalInterest;
    }
}
