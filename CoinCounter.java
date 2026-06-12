// Shaurya Jain
// CoinCounter
// This program counts the number of coins a user has and calculates the total value of those coins.

import java.util.Scanner;

public class CoinCounter {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Coin Counter\n");

        boolean cont = true;

        while (cont = true) {
            NumberOfCoins();

            System.out.println("Enter 0 to count coins, 1 to display totals,\n or 2 to exit: ");
            Scanner kb = new Scanner(System.in);
            int choice = kb.nextInt();

            if (choice == 0) {
                NumberOfCoins();
            } else if (choice == 1) {
                displayTotals();
            } else if (choice == 2) {
                cont = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Exiting program.");
    }

    public static int NumberOfCoins() {
        System.out.println("Enter the number of pennies: ");
        int pennies = kb.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = kb.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = kb.nextInt();

        System.out.print("Enter the number of quarters: ");
        int quarters = kb.nextInt();
    }
}