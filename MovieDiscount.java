/*
 * Programmer: Elliott Vince
 * Date: September 25, 2020
 * Purpose: Calculates the price of a movie ticket 
 * 			based on the user's age and if they have a coupon.
 */

import java.util.Scanner;

public class MovieDiscount {
	
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean hasCoupon = input.nextBoolean();

        // Creates the price variable and assigns the default cost of the ticket to it.
        double price = 14.50;
        
        // Print the cost of a movie ticket
        if (age < 13 || age >= 65) {
        	price -= 3.0;
        	
        	if (hasCoupon) {
        		price -= 2.0;
        	}
        }
        else if (hasCoupon) {
        	price -= 2.0;
        }
        
        System.out.println("Your ticket costs $" + price + ".");
    }
}
