package abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		Jasper jasper = new Jasper(new ConcreteFactoryAdidas());
		jasper.getVaatteet();
		
		System.out.println("Valmistuu");
		jasper.vaihdaVaatteet(new ConcreteFactoryBoss());
		jasper.getVaatteet();
	}

}
