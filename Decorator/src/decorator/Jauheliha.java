package decorator;

public class Jauheliha extends PizzaDecorator{

	public Jauheliha(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getNimi() {
		return super.getNimi() + " täyte:jauheliha ";
	}

	@Override
	public int getHinta() {
		return super.getHinta()+4;
	}

}
