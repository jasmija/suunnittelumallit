package abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		Jasper jasper = new Jasper();
		jasper.getVaatteet();
		
		System.out.println("Valmistuu");
		jasper.vaihdaVaatteet();
		jasper.getVaatteet();
	}

}
