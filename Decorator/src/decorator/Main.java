package decorator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Pizza1
		Pizza pizza = new Kinkku(new Ananas(new Pannu(new Hawaji())));

		System.out.println("Nimi: " + pizza.getNimi());
		System.out.println("Hinta: " + pizza.getHinta());
		
		//Pizza2
		Pizza pizza2 = new Jauheliha(new Tomaatti(new Normaali(new Bolognese())));

		System.out.println("Pohja: " + pizza2.getNimi());
		System.out.println("Hinta: " + pizza2.getHinta());
		
		//Pizza3
		Pizza pizza3 = new Jauheliha(new Kinkku(new Tomaatti(new Normaali(new Fantasia()))));

		System.out.println("Pohja: " + pizza3.getNimi());
		System.out.println("Hinta: " + pizza3.getHinta());
	}	
}
