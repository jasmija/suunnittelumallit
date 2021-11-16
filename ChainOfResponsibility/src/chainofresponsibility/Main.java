package chainofresponsibility;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Lähiesimies lähiesimies = new Lähiesimies();
		Päällikkö päällikkö = new Päällikkö();
		Toimitusjohtaja johtaja = new Toimitusjohtaja();
		
		lähiesimies.setHandler(päällikkö);
		päällikkö.setHandler(johtaja);
		
		Scanner lukija = new Scanner(System.in);
 
		System.out.println("Paljonko palkkaa korotetaan(%): ");
		int palkankorotus = lukija.nextInt();
		
		Palkankorotus korotus = new Palkankorotus(palkankorotus);
		korotus.setKorotus(palkankorotus);
		lähiesimies.handle(korotus);
	}
}
