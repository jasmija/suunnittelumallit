package adapter;

public class HintaAdapter implements IHintaAdapter {

	private Tuote tuote;
	
	public HintaAdapter(Tuote tuote) {
		this.tuote = tuote;
	}

	@Override
	public double getHinta() {
		return muunna(tuote.getHinta());
	}
	
	public double muunna(double tuote) {
		return tuote * 0.89;
		
	}
}
