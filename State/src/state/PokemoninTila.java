package state;

public abstract class PokemoninTila {

	public void hyökkää(Pokemon pokemon) {
	}

	public void puolusta(Pokemon pokemon) {
	}

	public void lyö(Pokemon pokemon) {
	}
	
	public abstract String getNimi();
	
	// Muutetaan tilaa
	public void vaihdaTila(Pokemon pokemon, PokemoninTila t) {
		pokemon.vaihdaTila(t);
	}

}
