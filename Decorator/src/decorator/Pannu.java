package decorator;

public class Pannu extends PizzaDecorator {

	public Pannu(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getNimi() {
		return super.getNimi() + "Pannupohja";
	}

	@Override
	public int getHinta() {
		return super.getHinta() + 5;
	}

}
