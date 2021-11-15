package state;

public class Pokemon {
	
	private PokemoninTila tila;

	public Pokemon() {
		tila = Charmander.getInstance();
	}

	// Toiminnot
	public void hyökkää() {
		tila.hyökkää(this);
	}

	public void puolusta() {
		tila.puolusta(this);
	}

	public void lyö() {
		tila.lyö(this);
	}
	
	protected void vaihdaTila(PokemoninTila t) {
		tila = t;
		System.out.println("Pokemonin tila vaihtui: " + tila.getNimi());
	}

}
