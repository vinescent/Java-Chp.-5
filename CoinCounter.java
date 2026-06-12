// Shaurya Jain
// CoinCounter
// This program counts the number of coins a user has and calculates the total value of those coins.

import java.util.Scanner;

public class CoinCounter {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("----------------Coin Counter----------------\n");

        boolean cont = true;

        int quarters = 0, 
        dimes = 0, 
        nickels = 0, 
        pennies = 0;

        while (cont == true) {
            System.out.print("\nEnter 0 to count coins, 1 to display totals, or 2 to exit: ");
            int choice = kb.nextInt();

            if (choice == 0) {
                quarters += Quarters();
                dimes += Dimes();
                nickels += Nickels();
                pennies += Pennies();
            } else if (choice == 1) {
                displayTotals(quarters, dimes, nickels, pennies);
            } else if (choice == 2) {
                cont = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Exiting program.");
    }

    public static int Quarters() {
        Scanner kb = new Scanner(System.in);
        System.out.print("\nEnter the number of quarters: ");
        return kb.nextInt();
    }

    public static int Dimes() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of dimes: ");
        return kb.nextInt();
    }

    public static int Nickels() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of nickels: ");
        return kb.nextInt();
    }

    public static int Pennies() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of pennies: ");
        return kb.nextInt();
    }

    public static void displayTotals(int quarters, int dimes, int nickels, int pennies) {
        double total = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

        System.out.println("\nCoins:     # of coin:  $ value:");
        System.out.printf("\nQuarters: \t" + quarters + "\t$%.2f\n", quarters * 0.25);
        System.out.printf("\nDimes: \t\t" + dimes + "\t$%.2f\n", dimes * 0.10);
        System.out.printf("\nNickels: \t" + nickels + "\t$%.2f\n", nickels * 0.05);
        System.out.printf("\nPennies: \t" + pennies + "\t$%.2f\n", pennies * 0.01);
        System.out.printf("Total value of coins: $%.2f\n", total);
    }
}

/* Output:
----------------Coin Counter----------------


Enter 0 to count coins, 1 to display totals, or 2 to exit: 0

Enter the number of quarters: 5
Enter the number of dimes: 2
Enter the number of nickels: 9
Enter the number of pennies: 6

Enter 0 to count coins, 1 to display totals, or 2 to exit: 0

Enter the number of quarters: 4
Enter the number of dimes: 78
Enter the number of nickels: 23
Enter the number of pennies: 56

Enter 0 to count coins, 1 to display totals, or 2 to exit: 1

Coins:     # of coin:  $ value:

Quarters: 	9	$2.25

Dimes: 		80	$8.00

Nickels: 	32	$1.60

Pennies: 	62	$0.62
Total value of coins: $12.47

Enter 0 to count coins, 1 to display totals, or 2 to exit: 2
Exiting program.

Completed with exit code: 0
*/