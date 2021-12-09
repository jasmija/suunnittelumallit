package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	/*
	 * 20. Iterator:
	 * 
	 * a) Tutki kuinka Javan iteraattori käyttäytyy, jos yritetään iteroida
	 * kokoelmaa kahdella säikeellä yhtä aikaa, kun molemmilla on oma iterattori.
	 * 
	 * Säikeet suorittavat iterointia erikseen, molemmat iteroivat listan läpi kokonaan.
	 *  
	 * b) Entä, jos säikeet käyttävät samaa iteraattoria vuorotellen?
	 * 
	 * Lista iteroidaan läpi vain kerran. Säikeet toimivat vuorotellen.
	 * 
	 * c) Kuinka käy, jos kokoelmaan tehdään muutoksia iteroinnin läpikäynnin
	 * aikana.
	 * 
	 * Listan iteroidaan aivan tavallisesti uusi alkio vain korvaa vanhan.
	 * 
	 * d) Keksi jotain muuta testattavaa (esim. iteraattorin remove).
	 * 
	 * Tulee virheilmoitus, mutta listan iteroiminen onnistuu silti.
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		//a)
		/*
		ArrayList<String> list = new ArrayList<String>();
		list.add("alkio1");
		list.add("alkio2");
		list.add("alkio3");
		list.add("alkio4");
		list.add("alkio5");

		Iterator iterator1 = list.iterator();
		Saie saie1 = new Saie(iterator1);
		
		Iterator iterator2 = list.iterator();
		Saie saie2 = new Saie(iterator2);
		
		saie1.start();
		saie2.start();
		*/
		
		
		//b)
		/*
		ArrayList<String> list = new ArrayList<String>();
		list.add("alkio1");
		list.add("alkio2");
		list.add("alkio3");
		list.add("alkio4");
		list.add("alkio5");
		
		Iterator iterator1 = list.iterator();
		Saie saie1 = new Saie(iterator1);
		Saie saie2 = new Saie(iterator1);
		
		saie1.start();
		saie2.start();
		
		saie1.join();
		saie2.join();
		*/
		
		
		//c) ja d)
		ArrayList<String> list = new ArrayList<String>();
		list.add("alkio1");
		list.add("alkio2");
		list.add("alkio3");
		list.add("alkio4");
		list.add("alkio5");
		
		Iterator iterator1 = list.iterator();
		Saie saie1 = new Saie(iterator1);
		saie1.start();
		
		//c)
		list.set(3, "alkio6");
		
		//d)
		iterator1.remove();
		
	}

}
