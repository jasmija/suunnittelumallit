package visitor;


public class VisitorPokemon implements Visitor {

	@Override
	public void vieraile(Pokemon pokemon) {
		
			int pisteet = pokemon.getPisteet();
			String nimi = pokemon.getClass().toString();
			nimi = pokemon.getNimi();
			
			if(nimi.equals("Charmander")) {
				if (pisteet > 10) {
					pokemon.vaihdaTila(Charmeleon.getInstance());
				}	
			}else if(nimi.equals("Charmeleon")) {
				if (pisteet > 25) {
					pokemon.vaihdaTila(Charizard.getInstance());
				}
			}else {
				if(pisteet > 40) {
					System.out.println("Charizard on nyt täysin kehittynyt pokemon!");
					System.exit(0);
				}
			}
	}
}
