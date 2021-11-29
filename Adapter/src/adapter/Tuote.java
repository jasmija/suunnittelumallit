package adapter;

public class Tuote implements Hinta{

	private double hinta;
	
	public Tuote(double hinta) {
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}
}
