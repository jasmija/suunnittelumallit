package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProxyExample {
	/**
	 * Test method
	 */
	public static void main(final String[] arguments) {

		List<Image> valokuvakansio = new ArrayList<Image>();

		Image image1 = new ProxyImage("HiRes_10MB_Photo1", "Kesäkuva");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2", "Lapsuuskuva");

		valokuvakansio.add(image1);
		valokuvakansio.add(image2);

		System.out.println("Selataan kansion kuvat ja niiden nimet:");
		System.out.println("----------------------");
		
		int i = 0;
		for (i = 0; i < valokuvakansio.size(); i++) {
			valokuvakansio.get(i).displayImage();
			valokuvakansio.get(i).showData();
			System.out.println("----------------------");
		}
		
		System.out.println("Selataan kansio uudestaan:");
		System.out.println("----------------------");

		for (i = 0; i < valokuvakansio.size(); i++) {
			valokuvakansio.get(i).displayImage();
			valokuvakansio.get(i).showData();
			System.out.println("----------------------");
		}
	}

}
