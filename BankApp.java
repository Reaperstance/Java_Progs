import java.util.*;

class BankAc 
{
    public int ac_num;
    public double bal;
    public String type;
    public String acn;

    BankAc()  
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Account Number:");
        ac_num = sc.nextInt();
	acn = Integer.toString(ac_num);

        System.out.println("Enter your balance:");
        bal = sc.nextDouble();

        System.out.println("Enter the type of account (C for Current, S for Savings):");
        type = sc.next().toUpperCase();
    }

    public void checkBalance() 
    {
        System.out.println("Current Balance: " + bal);
    }

    public void deposit() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you wish to deposit:");
        double amount = sc.nextDouble();

        if (amount > 0) 
        {
            bal += amount;
            System.out.println("The amount " + amount + " added to your balance!");
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw()  
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you wish to withdraw:");
        double amount = sc.nextDouble();

        Atm atm = new Atm();
        double newBalance = bal;
        atm.pTrans(acn, type, amount, newBalance);
        bal = newBalance;
    }
}

class Atm 
{
    public void pTrans(String ac_num, String accType, double amount, double balance) 
    {
        if (accType == "S" && amount > 10000) 
        {
            System.out.println("Withdrawal not allowed! Savings accounts cannot withdraw more than 10,000.");
            return;
        }

        if (amount > balance) 
        {
            System.out.println("Insufficient balance!");
	    return;
        }

        balance -= amount;
        System.out.println("The amount " + amount + " withdrawn successfully.");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class BankApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BankAc account = null;

        while (true) 
        {
            System.out.println(" \n 1. Create Account \n 2. Check Balance \n 3. Transactions \n 4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1)
            {
                account = new BankAc();
            } 
            else if (choice == 2) 
            {
                if (account == null) 
                {
                    System.out.println("No account found! Please create an account first.");
                } 
                else 
                {
                    account.checkBalance();
                }
            } 
            else if (choice == 3) 
            {
                if (account == null) 
                {
                    System.out.println("No account found! Please create an account first.");
                } 
                else 
                {
                    System.out.println(" 1. Deposit \n 2. Withdraw ");
                    int tch = sc.nextInt();

                    if (tch == 1)
                    {
                        account.deposit();
                    } 
                    else if (tch == 2) 
                    {
                        account.withdraw();  
                    } 
                    else 
                    {
                        System.out.println("Invalid transaction choice.");
                    }
                }
            } 
            else if (choice == 4) 
            {
                System.out.println("Exiting the program. Thank you!");
                break;
            } 
            else 
            {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
