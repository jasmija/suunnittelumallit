package visitor;

public class Charmeleon extends PokemoninTila {

	private static Charmeleon INSTANCE = null;

	public void hyökkää(Pokemon pokemon) {
		System.out.println("Charmeleon hyökkää");
	}

	public void puolusta(Pokemon pokemon) {
		System.out.println("Charmeleon puolustaa");
	}

	public void lyö(Pokemon pokemon) {
		System.out.println("Charmeleon lyö");
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
