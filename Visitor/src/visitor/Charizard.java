package visitor;

public class Charizard extends PokemoninTila {

	private static Charizard INSTANCE = null;

	public void hyökkää(Pokemon pokemon) {
		System.out.println("Charizard hyökkää");
	}

	public void puolusta(Pokemon pokemon) {
		System.out.println("Charizard puolustaa");
	}

	public void lyö(Pokemon pokemon) {
		System.out.println("Charizard lyö");
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
