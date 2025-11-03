import java.util.*;

class Account {
    String customerName;
    String typeOfAccount;
    long accountNumber;
}

class CurrentAccount extends Account{
    private double balance = 10000.0;

    CurrentAccount(long accNum,String name){
        this.accountNumber = accNum;
        this.customerName = name;
    }

    public void deposit(int amt){
        balance = balance + amt;
    }

    public void displayBalance(){
        System.out.println("The current balance is :"+ balance);
    }

    public void withdraw(int amt){
        balance = balance - amt;
        int minBalance = 10000;
        if (balance < minBalance){
            int penalty = 1000;
            balance = balance - penalty;
        }
    }

    public void computeAndDepositInterest(int years){
        double interest = 0.08;
        double amount = balance * Math.pow(1+ interest,years);
        double interestAmt = amount - balance;
        balance = amount;
        System.out.println("Compounded amount :"+balance);
        System.out.println("Interest amount added :"+interestAmt);
    }
}

class SavingsAccount extends Account{
    private double balance = 1000.0;

    SavingsAccount(long accNum, String name){
        this.accountNumber = accNum;
        this.customerName = name;
    }

    public void deposit(int amt){
        balance = balance + amt;
    }

    public void displayBalance(){
        System.out.println("The current balance is :"+ balance);
    }

    public void withdraw(int amt){
        balance = balance - amt;
        int minBalance = 1000;
        if (balance < minBalance){
            int penalty = 500;
            balance = balance - penalty;
        }
    }

    public void computeAndDepositInterest(int years){
        double interest = 0.06;
        double amount = balance * Math.pow(1+ interest,years);
        double interestAmt = amount - balance;
        balance = amount;
        System.out.println("Compounded amount :"+balance);
        System.out.println("Interest amount added :"+interestAmt);
    }
}

class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating one Savings and one Current account
        CurrentAccount person1_C = new CurrentAccount(12345678, "Aditya Paul");
        SavingsAccount person1_S = new SavingsAccount(31415926, "Aditya Paul");

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Display Balance");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Compute & Deposit Interest");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter which type of Account - 1 for Savings | 2 for Current:");
                    int ch1 = sc.nextInt();
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmt = sc.nextInt();
                    if (ch1 == 1)
                        person1_S.deposit(depositAmt);
                    else
                        person1_C.deposit(depositAmt);
                    break;

                case 2:
                    System.out.println("Enter which type of Account - 1 for Savings | 2 for Current:");
                    int ch2 = sc.nextInt();
                    if (ch2 == 1)
                        person1_S.displayBalance();
                    else
                        person1_C.displayBalance();
                    break;

                case 3:
                    System.out.println("Enter which type of Account - 1 for Savings | 2 for Current:");
                    int ch3 = sc.nextInt();
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmt = sc.nextInt();
                    if (ch3 == 1)
                        person1_S.withdraw(withdrawAmt);
                    else
                        person1_C.withdraw(withdrawAmt);
                    break;

                case 4:
                    System.out.println("Enter which type of Account - 1 for Savings | 2 for Current:");
                    int ch4 = sc.nextInt();
                    System.out.print("Enter the number of years: ");
                    int years = sc.nextInt();
                    if (ch4 == 1)
                        person1_S.computeAndDepositInterest(years);
                    else
                        person1_C.computeAndDepositInterest(years);
                    break;

                case 5:
                    System.out.println("Thank you for using our banking system!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

