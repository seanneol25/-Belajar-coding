import java.util.Scanner;

public class Main{

   static Scanner scanner = new Scanner (System.in); //scanner object for user input

    public static void main(String[] args) {
        double balance = 0;

        boolean isRunning = true;
        int choice;
        while(isRunning){ //main loop
            System.out.println("********************");
        System.out.println("Banking Programn");
        System.out.println("********************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("********************");

        System.out.print("Enter your choice(1-4): ");
        choice = scanner.nextInt();

        switch(choice){ //switch case for user choice 
            case 1 ->
            showBalance(balance); //show balance method 
            case 2 ->
            balance += deposit(); //deposit method
            case 3 ->
            balance -= withdraw(balance); //withdraw method
            case 4 -> 
                isRunning = false; //exit the program 
                default -> 
                System.out.println("Invalid Choice");
            }
        }
        System.out.println("****************************************");
        System.out.println("Thank you for using our banking program.");
        System.out.println("****************************************");



     }

     static void showBalance(double balance){ //show balance method
        System.out.println("********************");
        System.out.printf("Your balance is: RM%.2f\n", balance); //formatted to 2 decimal places
     }

     static double deposit(){ //deposit method

        double amount;
        System.out.print("Enter amount to deposit: RM");
        amount = scanner.nextDouble();

        if(amount < 0){ //check for invalid amount
            System.out.println("Invalid amount");
            return 0;
        } else { //successful deposit 
            System.out.println("Successfully deposited RM" + amount);
            return amount;
         }
        }

        static double withdraw(double balance){ //withdraw method
            double amount;
            System.out.print("Enter amount to withdraw: RM");
            amount = scanner.nextDouble();

            if(amount > balance){ //check for insufficient balance
                System.out.println("INSUFFICIENT BALANCE");
                return 0;
            }
            else if (amount < 0) { //check for invalid amount
                System.out.println("INVALID AMOUNT");
                return 0;
            }
            else{ //successful withdraw
                return amount;
            }
        }
     }
       
        
    
    



       

        