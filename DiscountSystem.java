/*************************************************
 * DiscountSystem.java
 * Author: Joe Goode
 *
 * This program calculates an employee's discount 
 * based on their job title and item price. It 
 * includes input validation and discount logic 
 * using if statements and a switch.
 **************************************************/

import java.util.Scanner;

public class DiscountSystem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Employee Discount Calculator!");
        System.out.println("Please enter your job title: ");
        String jobTitle = scnr.nextLine();

        if (jobTitle.equalsIgnoreCase("manager")) {
            System.out.println("Managers cannot receive discounts.");
            return;    
        }
        double discountRate = 0.0;

        switch (jobTitle.toLowerCase()) {
            case "supervisor":
                discountRate = 0.10;
                break;
            case "sales representative":
                discountRate = 0.15;
                break;
            default:
                discountRate = 0.20;
                break;
        }
        System.out.print("Please enter the price of the item you'd like discounted: $");
        double price = scnr.nextDouble();  
        
        double finalPrice = price - (price * discountRate);
        System.out.printf("Final price after discount: $%.2f%n", finalPrice);
    }
}

