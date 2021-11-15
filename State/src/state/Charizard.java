package state;

public class Charizard extends PokemoninTila {

	private int points = 0;
	private static Charizard INSTANCE = null;

	public void hyökkää(Pokemon pokemon) {
		if(points >= 20) {
			System.out.println("Pokemon täysin kehittynyt!!");
			System.exit(0);
		}else {
			points = points + 2;
			System.out.println("Charizard hyökkää: " + points);
			System.out.println("Pisteet: " + points);
		}
	}

	public void puolusta(Pokemon pokemon) {
		if(points >= 20) {
			System.out.println("Pokemon täysin kehittynyt!!");
			System.exit(0);
		}else {
			points = points + 5;
			System.out.println("Charizard puolustaa: " + points);
			System.out.println("Pisteet: " + points);
		}
	}

	public void lyö(Pokemon pokemon) {
		if(points >= 20) {
			System.out.println("Pokemon täysin kehittynyt!!");
			System.exit(0);
		}else {
			points = points + 4;
			System.out.println("Charizard lyö: " + points);
			System.out.println("Pisteet: " + points);
		}
	}
	
	public static PokemoninTila getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charizard();
		}
		return INSTANCE;
	}
	
	public String getNimi() {
		return "Charizad";
	}

}
