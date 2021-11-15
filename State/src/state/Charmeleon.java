package state;

public class Charmeleon extends PokemoninTila {

	private int points = 0;
	private static Charmeleon INSTANCE = null;
	
	public void hyökkää(Pokemon pokemon) {
		if (points >= 10) {
			vaihdaTila(pokemon, Charizard.getInstance());
		}else {
			System.out.println("Charmeleon hyökkää:");
			points = points + 4;
			System.out.println("Pisteet: " + points);
		}
	}

	public void puolusta(Pokemon pokemon) {
		if (points >= 10) {
			vaihdaTila(pokemon, Charizard.getInstance());
		}else {
			System.out.println("Charmeleon puolustaa");
			points = points - 1;
			System.out.println("Pisteet: " + points);
		}
	}

	public void lyö(Pokemon pokemon) {
		if (points >= 10) {
			vaihdaTila(pokemon, Charizard.getInstance());
		}else {
			System.out.println("Charmeleon lyö");
			points = points + 3;
			System.out.println("Pisteet: " + points);
		}
	}

	public static PokemoninTila getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}
	
	public String getNimi() {
		return "Charmeleon";
	}
}
