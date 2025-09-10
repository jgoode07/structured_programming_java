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
    }
}

