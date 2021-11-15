package state;

public class Charmander extends PokemoninTila {

	private int points = 0;
	private static Charmander INSTANCE = null;

	int max = 1;
	int min = 0;
	int range = max - min + 1;

	public void hyökkää(Pokemon pokemon) {
		if (points >= 10) {
			vaihdaTila(pokemon, Charmeleon.getInstance());
		} else {
			System.out.println("Charmander hyökkää:");
			int rand = (int) (Math.random() * range) + min;
			if (rand == 1) {
				System.out.println("Charmander voitti!!");
				points = points + 3;
			}else {
				points = points - 1;
				System.out.println("Charmander hävisi..");
			}
			System.out.println("Pisteet: " + points);
		}
	}

	public void puolusta(Pokemon pokemon) {
		if (points >= 10) {
			vaihdaTila(pokemon, Charmeleon.getInstance());
		}else {
			System.out.println("Charmander puolustaa:");
			points = points - 1;
			System.out.println("Pisteet: " + points);
		}
	}

	public void lyö(Pokemon pokemon) {
		if (points >= 10) {
			vaihdaTila(pokemon, Charmeleon.getInstance());
		}else {
			System.out.println("Charmander lyö:");
			points = points + 3;
			System.out.println("Pisteet: " + points);
		}
	}

	public static PokemoninTila getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}

	public String getNimi() {
		return "Charmander";
	}

}
