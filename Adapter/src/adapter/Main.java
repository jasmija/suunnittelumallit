package adapter;

public class Main {

	public static void main(String args[]) {
		
		Tuote tuote = new Tuote(33);
		System.out.println("Hinta dollareina: " + tuote.getHinta());
		HintaAdapter muunnettuHinta = new HintaAdapter(tuote);
		System.out.println("Hinta euroina: " + muunnettuHinta.getHinta());
		
	}

}
