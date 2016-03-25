/**
 *   File Name: FarewellMessage.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 24, 2016
 *
 */

package com.sqa.lp.farewell;

import java.util.*;

/**
 * FarewellMessage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class FarewellMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ask user for their name
		System.out.println("Welcome to my Farewell Application! Could I have your name please ?");
		// Create the scanner Object to allow input from console
		Scanner scanner = new Scanner(System.in);
		// Collect their name in a local variable name of type String
		String name = scanner.nextLine();
		// Say Goodbye to the user
		System.out.println("Thank you for using my simple application " + name + "Have a great day!");

	}

}
