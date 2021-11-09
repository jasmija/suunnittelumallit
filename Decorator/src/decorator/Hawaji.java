package decorator;

public class Hawaji implements Pizza{

	@Override
	public String getNimi() {
		return "Hawaji ";
	}

	@Override
	public int getHinta() {
		return 0;
	}

}
