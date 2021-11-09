package decorator;

public class Kinkku extends PizzaDecorator{

	public Kinkku(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getNimi() {
		return super.getNimi() + " täyte:kinkku ";
	}

	@Override
	public int getHinta() {
		return super.getHinta() + 3;
	}

}
