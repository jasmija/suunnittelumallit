package decorator;

public class Tomaatti extends PizzaDecorator {

	public Tomaatti(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getNimi() {
		return super.getNimi() + " täyte:tomaatti";
	}

	@Override
	public int getHinta() {
		return super.getHinta() + 1;
	}

}
