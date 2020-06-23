/**
 * 
 */
package edu.cvtc.java;

import java.util.Scanner;

import edu.cvtc.java.Circle;
import edu.cvtc.java.Rectangle;
import edu.cvtc.java.Triangle;

/**
 * @author Dieter
 *
 */
public class Geometry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		boolean repeat = true;
		
		while (repeat) {
			repeat = false;
			System.out.println("Geometry Calculator");
			System.out.println("1. Calculate the Area of a Circle");
			System.out.println("2. Calculate the Area of a Rectangle");
			System.out.println("3. Calculate the Area of a Triangle");
			System.out.println("4. Quit");
			System.out.println("Enter your vhoice (1-4):");
			double userInput = keyboard.nextDouble();
			
			boolean negative = true;
			
			while (negative) {
		        if (userInput == 1) {
					System.out.println("Calculate the Area of a Circle. Please enter the Radius:");
					double radius = keyboard.nextDouble();
					
					if (radius >= 0) {
						negative = false;
						System.out.println("Circle Area: " + Circle.area(radius));
					} else {
						System.out.println("Error; not a valid entry.");
					}
		
					
		        } else if (userInput == 2) {
		            System.out.println("Calculate the Area of a Rectangle. Please enter the length:");
		            double length = keyboard.nextDouble();
		            System.out.println("Please enter the width:");
		            double width = keyboard.nextDouble();
		            
					if (length >= 0 || width >= 0) {
						negative = false;
			    		System.out.println("Rectangle Area: " + Rectangle.area(length, width));
					} else {
						System.out.println("Error; not a valid entry.");
					}
		    		
		        } else if (userInput == 3) {
		            System.out.println("Calculate the Area of a Triangle. Please enter the base length:");
		            double base = keyboard.nextDouble();
		            System.out.println("Please enter the height:");
		            double height = keyboard.nextDouble();
		            
					if (base >= 0 || height >= 0) {
						negative = false;
			            System.out.println("Triangle Area: " + Triangle.area(base, height));
					} else {
						System.out.println("Error; not a valid entry.");
					}
		
		            
		        } else if (userInput == 4) {
					negative = false;
		            /* the user wanted to quit so nothing from this point is done
		             */
		            
		        } else {
					negative = false;
					System.out.println("Error; not a valid entry.");
					repeat = true;					
		        }
			}
		}
        keyboard.close();
	}
}
