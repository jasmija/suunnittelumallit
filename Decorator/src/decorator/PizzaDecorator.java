package decorator;

public abstract class PizzaDecorator implements Pizza {
	
	protected Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getNimi() {
		return pizza.getNimi();
	}

	public int getHinta() {
		return pizza.getHinta();
	}
	
}
