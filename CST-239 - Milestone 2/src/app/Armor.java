package app;

import java.util.Scanner;

public class Armor {
	
	//initialize private variables
	private static int lightArmorPrice = 750;
	private static int heavyArmorPrice = 1000;
	private static int lightArmorPoints = 25;
	private static int heavyArmorPoints = 50;
	private static int maxArmor = 200;
	private static int currentArmor;
	
	//set values
	public Armor(int lightArmorPrice, int maxArmor, int heavyArmorPoints, int lightArmorPoints, int heavyArmorPrice, int currentArmor, boolean purchasedLightArmor) {
		this.lightArmorPrice = lightArmorPrice;
		this.heavyArmorPrice = heavyArmorPrice;
		this.lightArmorPoints = lightArmorPoints;
		this.maxArmor = maxArmor;
		this.currentArmor = currentArmor;
	}
	
	//get values
	public static int getHeavyArmor() {
		return heavyArmorPrice;
	}
	
	public static int getLightArmorPoints() {
		return lightArmorPoints;
	}
	
	public static int getLightArmorPrice() {
		return lightArmorPrice;
	}
	
	public static int getHeavyArmorPoints() {
		return heavyArmorPoints;
	}
	
	
	public static int purchaseArmor() {
		//initialize variables
		int price = 0;
		Scanner scnr = new Scanner(System.in);
		//prompt the customer for input and store their response in var purchaseResponse
		System.out.print("Would you like to purchase some armor? Type Yes or No: ");
		String purchaseResponse = scnr.nextLine();
		
		//checking the yes/no response for equality
		if (purchaseResponse.equals("Yes")) {
			System.out.print("The light armor is $" + lightArmorPrice + " and the heavy armor is $" + heavyArmorPrice +
					".\nWhich would you like to purchase? (Type Heavy or Light): ");
			String armorType = scnr.nextLine();
			//if response == yes, which type of armor? I begin adding up the total in the price var based on responses
			if(armorType.equals("Heavy")) {
				price += getHeavyArmor();
				//checking if current armor + purchased armor is > the max armor amount. If the total is > than Max Armor, 
				//set the customer's current armor to the maximum allowable amount
				if (currentArmor + getHeavyArmorPoints() >= maxArmor) {
					currentArmor = maxArmor;
				}
				else {
					currentArmor += getHeavyArmorPoints();
				} 
			}
			else {
				price += getLightArmorPrice();
				if (currentArmor + getLightArmorPrice() >= maxArmor) {
					currentArmor = maxArmor;
				}
				else {
					currentArmor += getLightArmorPoints();
				} 
			}			
		}
		//if customer responds 'no' to initial question, set the price to 0
		else if (purchaseResponse.equals("No")) {
			price += 0;
		}
				
		return price;		
	}
	
}
