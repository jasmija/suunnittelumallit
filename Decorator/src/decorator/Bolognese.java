package decorator;

public class Bolognese implements Pizza{

	@Override
	public String getNimi() {
		return "Bolognese ";
	}

	@Override
	public int getHinta() {
		return 0;
	}

}
