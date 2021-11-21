package visitor;

public class MainVisitor {

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon(0);
		Visitor visit = new VisitorPokemon();
		
		for(int i = 0; i < 50; i++) {
			pokemon.hyökkää(visit);
			pokemon.lyö(visit);
			pokemon.puolusta(visit);
		}
	}

}
