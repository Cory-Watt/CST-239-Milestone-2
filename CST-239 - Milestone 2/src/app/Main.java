package app;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		int health = (int) (Math.random() * 200) + 1;
		int armor = (int) (Math.random() * 200) + 1;
		int currentAmmo = (int) (Math.random() * 10000) + 1;
		String input = "";
		String input1 = "";
		String input2 = "";
		String input3 = "";
		int total = 0;
		
		System.out.print("Do you want check out our armor? (Type Yes or No): ");
		input = scnr.nextLine();
		if (input.equals("Yes")) {
			total += Armor.purchaseArmor();
		}
		System.out.println("Total: " + total);
		System.out.println();
		
		System.out.print("Do you want check out our medical supplies? (Type Yes or No): ");
		input1 = scnr.nextLine();
		if (input1.equals("Yes")) {
			total += Health.purchaseHealth(health);
		}
		System.out.println("Total: " + total);
		System.out.println();
		
		System.out.print("Do you want check out our clothing? (Type Yes or No): ");
		input2 = scnr.nextLine();
		if (input2.equals("Yes")) {
			total += Products.buyProducts();
		}
		System.out.println("Total: " + total);
		System.out.println();
		
		System.out.print("Do you want check out our weapons/ammo? (Type Yes or No): ");
		input3 = scnr.nextLine();
		if (input3.equals("Yes")) {
			total += Weapon.purchaseWeapon(currentAmmo);
		}
		System.out.println();
		System.out.println("Your grand total is $" + total);
	}

}
