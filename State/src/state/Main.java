package state;

public class Main {

	public static void main(String[] args) {
	
		Pokemon pokemon = new Pokemon();
		
		// Pokemon tekee jotain
		// Tila päivittyy
		for(int i = 0; i < 100; i++) {
			pokemon.hyökkää();
			pokemon.lyö();
			pokemon.puolusta();
			i++;
		}
	}
}
