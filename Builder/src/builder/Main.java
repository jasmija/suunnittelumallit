package builder;

public class Main {

	public static void main(String[] args) {
	
		Director director = new Director();
		IBurgeriBuilder burgeriBuilder = new HesburgerBuilder();
		director.setBurgeriBulder(burgeriBuilder);
		director.kokoaBurgeri();
		Hesburger burger = (Hesburger)burgeriBuilder.getBurgeri();
		
		McDonaldsBuilder builder = new McDonaldsBuilder();
		director.setBurgeriBulder(builder);
		director.kokoaBurgeri();
		McDonalds burgeri = builder.getBurgeri();
		//System.out.println(burgeri);
	}
}
