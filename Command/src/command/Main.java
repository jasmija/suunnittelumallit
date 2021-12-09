package command;

public class Main {

	public static void main(String[] args) {
		
		Valokangas valokangas = new Valokangas();
		
		Command valokangasYlos = new YlosCommand(valokangas);
		Command valokangasAlas = new AlasCommand(valokangas);
		
		Seinapainike seinapainike1 = new Seinapainike(valokangasYlos);
		Seinapainike seinapainike2 = new Seinapainike(valokangasAlas);
		
		seinapainike1.paina();
		seinapainike2.paina();

	}

}
