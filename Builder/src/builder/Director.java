package builder;

public class Director {
	
	private IBurgeriBuilder burgeriBuilder;

	public void setBurgeriBulder(IBurgeriBuilder bb) {
		burgeriBuilder = bb;
	}
	
	public void kokoaBurgeri() {
		burgeriBuilder.kokoaUusiBurgeri();
		burgeriBuilder.lisääMajoneesi();
		burgeriBuilder.lisääPihvi();
		burgeriBuilder.lisääSämpylä();
		burgeriBuilder.lisääTäyte();
	}
}
