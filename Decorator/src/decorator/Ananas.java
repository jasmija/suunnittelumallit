package decorator;

public class Ananas extends PizzaDecorator{

	public Ananas(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getNimi() {
		return super.getNimi() + " täyte:ananas ";
	}

	@Override
	public int getHinta() {
		return super.getHinta() + 1;
	}

}
