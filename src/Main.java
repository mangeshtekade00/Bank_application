import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to NoBank !!!  Open your account");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = sc.next();
        System.out.println("Enter your initial balance for account opening");
        int initialBalance = sc.nextInt();
        System.out.println("Enter your password");
        String password = sc.next();

        NoBank bankAccount = new NoBank(userName, password, initialBalance);
        System.out.println("Enter the money you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String enterPassword = sc.next();

        String response = bankAccount.withdrawMoney(money, enterPassword);
        System.out.println(response);


        //addMoney

        System.out.println("Enter the money you want to add");
        money = sc.nextInt();
        System.out.println("Enter your password");
         enterPassword = sc.next();

        response = bankAccount.addMoney(money, enterPassword);
        if(response.equals("Password is incorrect"))
            System.out.println(response);
        System.out.println("Enter your password again !!");
        enterPassword = sc.next();

        response = bankAccount.addMoney(money, enterPassword);
        System.out.println(response);





        //check balance
        System.out.println("Enter your password to check balance ");
        enterPassword = sc.next();
        int finalBalance = bankAccount.checkBalance(enterPassword);
        System.out.println("The final Balance is "+finalBalance);


        //total interest calculated

        System.out.println("Enter the no. of years you want to save money");
        int years = sc.nextInt();
       double totalInterest = bankAccount.calculateInterest(years);
        System.out.println("The total interest is "+totalInterest);


    }
}