// Shaurya Jain
// Shapes
// 

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // menu
        System.out.println("Enter the number corresponding to the shape you want to calculate the area of:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        int choice = kb.nextInt();

        if (choice == 1) {
            rect();
        } else if (choice == 2) {
            tri();
        } else if (choice == 3) {
            circ();
        } else {
            System.out.println("Invalid choice.");
        }
    }
    
    public static void rect() {
        double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area

      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }

   public static double getLength()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the rectangle's length: ");
      return keyboard.nextDouble();
   }

   public static double getWidth()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the rectangle's width: ");
      return keyboard.nextDouble();
   }

   public static double getArea(double length, double width)
   {
      return length * width;
   }

   public static void displayData(double length, double width, double area)
   {
      System.out.println("\nRectangle Length:\t " + length);
      System.out.println("Rectangle Width:\t " + width);
      System.out.println("Rectangle Area:\t " + area);
   }

   public static void tri() {
        double base, height, area; // The triangle's initial variables
   
      // Get the triangle's width from the user.
      base = getBase();

      // Get the triangle's height.
      height = getHeight();

      // Get the triangle's area.
      area = getArea(base, height);

      // Display the triangle data.
      displayData(base, height, area);

      // Display the triangle data.
      displayData(base, height, area);
   }

   public static double getBase()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the triangle's base: ");
      return keyboard.nextDouble();
   }

   public static double getHeight()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the triangle's height: ");
      return keyboard.nextDouble();
   }

   public static double getArea(double base, double height)
   {
      return 0.5 * base * height;
   }

   public static void displayData(double base, double height, double area)
   {
      System.out.println("\nTriangle Base:\t " + base);
      System.out.println("Triangle Height:\t " + height);
      System.out.println("Triangle Area:\t " + area);
   }
}