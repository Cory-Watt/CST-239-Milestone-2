package app;

import java.util.Scanner;

public class Weapon {
	private static int pistol = 2000;
	private static int sniperRifle = 10000;
	private static int machineGun = 15000;
	private int ammoCost = 100;
	private int ammoQuantity = 50;
	private int currentAmmoQuantity;

	public Weapon(int pistol, int sniperRifle, int machineGun, int ammoCost, int ammoQuantity, int currentAmmoQuantity) {
		this.pistol = pistol;
		this.sniperRifle = sniperRifle;
		this.machineGun = machineGun;
		this.ammoCost = ammoCost;
		this.ammoQuantity = ammoQuantity;
		this.ammoQuantity = ammoQuantity;
	}

	public int getPistol() {
		return pistol;
	}

	public int getSniperRifle() {
		return sniperRifle;
	}

	public int getMachineGun() {
		return machineGun;
	}

	public int getAmmoCost() {
		return ammoCost;
	}

	public int getAmmoQuantity() {
		return ammoQuantity;
	}
	
	public static int purchaseWeapon(int currentAmmoQuantity) {
		//initialize var's
		int price = 0;
		String input = "";
		Scanner scnr = new Scanner(System.in);
		
		//prompt customer for input
		System.out.println("Would you like to buy a pistol ($2000), a sniper rifle "
				+ "($10,000), a machine gun ($15,000), or ammo (50 bullets for $100) (Type Pistol, Sniper, Machine, Ammo, (Type No to exit)): ");
		input = scnr.nextLine();
		if (input.equals("Pistol")) {
			price += pistol;
		}
		if (input.equals("SniperRifle")) {
			price += sniperRifle;
		}
		if (input.equals("Machine")) {
			price += machineGun;
		}
		if (input.equals("Ammo")) {
			price += pistol;
		}
		return price;
		
	}	
}
