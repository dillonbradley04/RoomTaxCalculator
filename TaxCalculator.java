package TaxCalculator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) throws FileNotFoundException {
		
		//The following 3 statements will allow the program to read from the "rooms.txt" file, and also scan any input 
		//that is entered by the manager
		
		FileReader file = new FileReader("rooms.txt");
		Scanner read = new Scanner (file);
		Scanner input = new Scanner (System.in);
		
		//I am specifying the default tax rate at the beginning, to ensure I don't forget about it later on.
		double taxRate = 2.0;
		
		//This if-else statement will, upon running, ask the manager if they want to stick with the default tax rate, 
		//(as declared before) or if they would like to enter their own custom tax rate.
		
		System.out.println("Hi, welcome to the system! Please enter '1' to begin.");
		int start = input.nextInt();
		if (start != 1) {
			System.out.println("Invalid input. Exiting the system.");
			System.exit(0);
		}

		System.out.println("Do you wish to enter a new tax rate? (yes/no)");
		String ans = input.next();
		if (ans.toLowerCase().equals("yes")) {
			System.out.println("Please enter your desired tax rate: ");
			taxRate = input.nextDouble();
		}
		else {
			System.out.println("We will assume the default tax rate of: " + taxRate);
		}
		
		//This next statement just separates the previous if-else statement and the following statements, to improve presentation.
		System.out.println(" ");
		
		//Here, I am telling the system to read the correct information from the "rooms.txt" file,
		//while also declaring variables and their data types.
		
		String roomType1 = read.next();
		int numberOfBookings1 = read.nextInt();
		double pricePerNight1 = read.nextDouble();
		
		String roomType2 = read.next();
		int numberOfBookings2 = read.nextInt();
		double pricePerNight2 = read.nextDouble();
		
		String roomType3 = read.next();
		int numberOfBookings3 = read.nextInt();
		double pricePerNight3 = read.nextDouble();
		
		//Here, I closed the file reader and the input scanner.
		input.close();
		read.close();
		
		//I then done some basic calculations to calculate the incomes before and after tax, for the 3 rooms.
		double incomeBeforeTax1 = (numberOfBookings1 * pricePerNight1);
		double incomeBeforeTax2 = (numberOfBookings2 * pricePerNight2);
		double incomeBeforeTax3 = (numberOfBookings3 * pricePerNight3);
		
		double incomeAfterTax1 = (incomeBeforeTax1 * taxRate);
		double incomeAfterTax2 = (incomeBeforeTax2 * taxRate);
		double incomeAfterTax3 = (incomeBeforeTax3 * taxRate);
		
		//I'm now using "system.out.println" to output the relevant information to the screen, for the manager to read.
		System.out.println("The room type is: "+ roomType1);
		System.out.println("The number of bookings for this room is: " + numberOfBookings1);
		System.out.println("The price per night for this room is: £" + pricePerNight1);
		System.out.println("The income before tax for this room is: £" + incomeBeforeTax1);
		System.out.println("The income after tax for this room is: £" + incomeAfterTax1);
		
	    //These "blank" output statements are used again to improve the presentation of the system and make it 
		//easier to understand.
		System.out.println(" ");
		
		System.out.println("The room type is: "+ roomType2);
		System.out.println("The number of bookings for this room is: " + numberOfBookings2);
		System.out.println("The price per night for this room is: £" + pricePerNight2);
		System.out.println("The income before tax for this room is: £" + incomeBeforeTax2);
		System.out.println("The income after tax for this room is: £" + incomeAfterTax2);
		System.out.println(" ");
		
		System.out.println("The room type is: "+ roomType3);
		System.out.println("The number of bookings for this room is: " + numberOfBookings3);
		System.out.println("The price per night for this room is: £" + pricePerNight3);
		System.out.println("The income before tax for this room is: £" + incomeBeforeTax3);
		System.out.println("The income after tax for this room is: £" + incomeAfterTax3);
		System.out.println(" ");
		
		//Next, I done some more basic calculations to determine the running totals of all the rooms, before and after tax.
		double totalIncomeBeforeTax = (incomeBeforeTax1 + incomeBeforeTax2 + incomeBeforeTax3);
		double totalIncomeAfterTax = (incomeAfterTax1 + incomeAfterTax2 + incomeAfterTax3);
		
		//Once again, i used "system.out.println" to output the running totals to the screen for the manager to read.
		System.out.println("The total income before tax for all rooms is: £" + totalIncomeBeforeTax);
		System.out.println("The total income after tax for all roooms is: £" + totalIncomeAfterTax);
		
	}
		}
		

