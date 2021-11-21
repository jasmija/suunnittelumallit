package visitor;

public class Charmander extends PokemoninTila {

	private static Charmander INSTANCE = null;

	public void hyökkää(Pokemon pokemon) {
		System.out.println("Charmander hyökkää");
	}

	public void puolusta(Pokemon pokemon) {
		System.out.println("Charmander puolustaa");
	}

	public void lyö(Pokemon pokemon) {
		System.out.println("Charmander lyö");
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
