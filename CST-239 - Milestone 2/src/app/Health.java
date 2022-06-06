package app;

import java.util.Scanner;

public class Health {
	private static int currentHealthPoints;
	private static int basicHealthPrice = 500;
	private static int basicHealthHP = 25;
	private static int premiumHealthHP = 50;
	private static int premiumHealthPrice = 750;
	private static int maxHealth = 200;
	
	public Health(int currentHealthPoints, int basicHealthHP, int premiumHealthHP, int basicHealthPrice, int premiumHealthPrice, int maxHealth) {
		this.currentHealthPoints = currentHealthPoints;
		this.premiumHealthPrice = premiumHealthPrice;
		this.basicHealthPrice = basicHealthPrice;
		this.basicHealthHP = basicHealthHP;
		this.maxHealth = maxHealth;
		this.premiumHealthHP = premiumHealthHP;
	}
	
	public static int getCurrentHealthPoints() {
		return currentHealthPoints;
	}

	public static int getPremiumHealthHP() {
		return premiumHealthHP;
	}

	public static int getBasicHealthHP() {
		return basicHealthHP;
	}

	public static int getPremiumHealthPrice() {
		return premiumHealthPrice;
	}
	
	public static int getBasicHealthPrice() {
		return basicHealthPrice;
	}

	public static int getMaxHealth() {
		return maxHealth;
	}
	
	public static int purchaseHealth(int currentHealthPoints) {
		//initializing variables 
		Scanner scnr = new Scanner(System.in);
		int price = 0;
		String response1 = "";
		String response2 = "";
		int currentHealth = getCurrentHealthPoints();
		int maxHealth = getMaxHealth();
		
		//tell the customer their starting health
		System.out.println("Your current health is " + currentHealthPoints);
		System.out.println("Would you like the buy a health pack? (Type Yes or No): ");
		response1 = scnr.nextLine();
		if (response1.equals("Yes")) {
			//if their response == yes, ask which pack they would like
			System.out.print("Would you like to buy the basic health pack (adds 25 health points) for $" + 
					+ basicHealthPrice + " or the premium health pack (adds 50 health points) for $" + premiumHealthPrice + "? "
							+ "(Type Premium or Basic for your selection): ");
			response2 = scnr.nextLine();
			if (response2.equals("Premium")) {
				price += getPremiumHealthPrice();
				//checking if current health + purchased health pack is > the max armor amount. If the total is > than Max Health, 
				//set the customer's current health status to the maximum allowable amount
				if (currentHealth >= maxHealth) {
					currentHealth = maxHealth;
				}
				else {
					currentHealth += getPremiumHealthHP();
				}
			}
			else {
				price += getBasicHealthPrice();
				if (currentHealth >= maxHealth) {
					currentHealth = maxHealth;
				}
				else {
					currentHealth += getBasicHealthHP();
				}
			}
		}
		//if customer responds 'no' to initial question, set the price to 0
		if (response1.equals("No")) {
			price += 0;
		}		
		return price;		
	}

}








