package templatemethod;

import java.util.ArrayList;
import java.util.List;

public class KiviPaperiSakset extends Game {

	final static String KIVI = "Kivi", PAPERI = "Paperi", SAKSET = "Sakset";
	int i = 0;
	int max = 2;
	int min = 0;
	int range = max - min + 1;

	List<String> tulokset1 = new ArrayList<String>();
	List<String> tulokset2 = new ArrayList<String>();

	@Override
	void initializeGame() {
		System.out.println("Kivi-paperi-sakset peli alkaa!");
		System.out.println("Paras kolmesta..");
	}

	@Override
	void makePlay(int player) {
		System.out.println("Pelaaja " + (player+1) + " pelaa");
		vuoro(player);
		i++;
	}

	@Override
	boolean endOfGame() {
		if (i == 6) {
			System.out.println("Peli loppui..");
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		int kierrosvoitot1 = 0;
		int kierrosvoitot2 = 0;
		for (int i = 0; i < tulokset1.size(); i++) {
			
			System.out.println("Pelaaja 1 tulokset: " + tulokset1.get(i));
			System.out.println("Pelaaja 2 tulokset: " + tulokset2.get(i));
			
			if(tulokset1.get(i) == tulokset2.get(i)) {
				System.out.println("Tasapeli");
				kierrosvoitot1++;
			}else if(tulokset2.get(i) == SAKSET && tulokset1.get(i) == KIVI){
				System.out.println("Pelaaja 1 voitti " + (i+1) + ". kierroksen");
				kierrosvoitot1++;
			}else if(tulokset2.get(i) == KIVI && tulokset1.get(i) == PAPERI){
				System.out.println("Pelaaja 1 voitti " + (i+1) + ". kierroksen");
				kierrosvoitot1++;
			}else if(tulokset2.get(i) == PAPERI && tulokset1.get(i) == SAKSET){
				System.out.println("Pelaaja 1 voitti " + (i+1) + ". kierroksen");
				kierrosvoitot1++;
			}else {
				System.out.println("Pelaaja 2 voitti " + (i+1) + ". kierroksen");
				kierrosvoitot2++;
			}
		}
		if(kierrosvoitot1 > kierrosvoitot2) {
			System.out.println("Voittaja on: Pelaaja 1");
		}
		else if(kierrosvoitot1 == kierrosvoitot2){
			System.out.println("Kaikki kolme kierrosta päättyi tasapeliin");
		}
		else {
			System.out.println("Voittaja on: Pelaaja 2");
		}
	}

	public void vuoro(int player) {
		if (player == 1) {
			tulokset1.add(tulos());
		} else {
			tulokset2.add(tulos());
		}
	}

	public String tulos() {
		int rand = (int) (Math.random() * range) + min;
		if (rand == 1) {
			System.out.println("Kivi");
			return "Kivi";
		} else if (rand == 2) {
			System.out.println("Sakset");
			return "Sakset";
		} else {
			System.out.println("Paperi");
			return "Paperi";
		}
	}

}
