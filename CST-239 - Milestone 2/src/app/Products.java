package app;

import java.util.Scanner;

public class Products {
	private static int shirt = 100;
	private static int pants = 200;
	private static int shoes = 75;
	
	public Products(int shirt, int pants, int shoes) {
		this.shirt = shirt;
		this.pants = pants;
		this.shoes = shoes;
	}
	
	public static int getShirt() {
		return shirt;
	}

	public static int getPants() {
		return pants;
	}

	public static int getShoes() {
		return shoes;
	}
	
	public static int buyProducts() {
		//initialize var's
		Scanner scnr = new Scanner(System.in);
		int price = 0;
		String input = "";
		
		//prompt customer for input
		System.out.println("Would you like to buy a shirt ($100), shoes ($75), or pants ($200)? (Type Shoes, Shirt, Pants, or type No to exit)");
		input = scnr.nextLine();
		//add up customer's ticket
		if (input.equals("Shirt")) {
			price += getShirt();
		}
		if (input.equals("Pants")) {
			price += getPants();		
		}
		if (input.equals("Shoes")) {
			price += getShoes();
		}
		if (input.equals("No"))
			price += 0;
		
		return price;
	}
}
