package visitor;


public class Pokemon {
	
	private PokemoninTila tila;
	private int pisteet;
	private String nimi;

	public Pokemon(int pisteet) {
		super();
		tila = Charmander.getInstance();
		this.pisteet = pisteet;
	}

	public void hyökkää(Visitor vieraile) {
		tila.hyökkää(this);
		vieraile.vieraile(this);
		pisteet = pisteet + 2;
	}

	public void puolusta(Visitor vieraile) {
		tila.puolusta(this);
		vieraile.vieraile(this);
		pisteet = pisteet + 1;
	}

	public void lyö(Visitor vieraile) {
		tila.lyö(this);
		vieraile.vieraile(this);
		pisteet = pisteet + 5;
	}
	
	public int getPisteet() {
		return pisteet;
	}

	public void setPisteet(int pisteet) {
		this.pisteet = pisteet;
	}
	
	protected void vaihdaTila(PokemoninTila t) {
		tila = t;
		System.out.println("Pokemonin tila vaihtui: " + tila.getNimi());
	}
	
	public String getNimi() {
		nimi = tila.getNimi();
		return nimi;
	}


}
