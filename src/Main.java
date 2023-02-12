import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password and balance");
        String name = sc.next();;
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount Prabagaran = new SBIAccount(name,balance,password);
        //getBalance
        System.out.println("Your account has been created with account number: "+Prabagaran.getAccountNo());

        //deposit money
        System.out.println(Prabagaran.depositMoney(500000));
        System.out.println("New balance is: "+Prabagaran.getBalance());

        //withdraw Money
        System.out.println("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();

        System.out.println(Prabagaran.withdraw(amount,enteredPassword));
        System.out.println("current balance: "+Prabagaran.getBalance());
        //interest
        System.out.println("Interst for 4 years on current balance "+Prabagaran.getBalance()+" is "+Prabagaran.calculateInterest(4));

    }
}