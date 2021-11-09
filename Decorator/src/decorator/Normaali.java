package decorator;

public class Normaali extends PizzaDecorator{

	public Normaali(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getNimi() {
		return super.getNimi() + "Normaalipohja ";
	}

	@Override
	public int getHinta() {
		return super.getHinta() + 3;
	}

}
