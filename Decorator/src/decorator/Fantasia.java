package decorator;

public class Fantasia implements Pizza {

	@Override
	public String getNimi() {
		return "Fantasia ";
	}

	@Override
	public int getHinta() {
		return 0;
	}
}
