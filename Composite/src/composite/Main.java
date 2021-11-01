package composite;

public class Main {

	public static void main(String args[]) {

		Laiteosa emolevy = new Emolevy();
		Laiteosa kotelo = new Kotelo();
		Laiteosa muistipiiri = new Muistipiiri();
		Laiteosa näytönohjain = new Näytönohjain();
		Laiteosa prosessori = new Prosessori();
		Laiteosa verkkokortti = new Verkkokortti();

		// Kooste1
		Kooste kooste1 = new Kooste();
		kooste1.lisaaLaiteosa(verkkokortti);
		kooste1.lisaaLaiteosa(prosessori);
		kooste1.lisaaLaiteosa(näytönohjain);
		kooste1.laiteosat();
		System.out.println("Kokonaishinta: " + kooste1.hinta() + "€");

		// Kooste2
		Kooste kooste2 = new Kooste();
		kooste2.lisaaLaiteosa(emolevy);
		kooste2.lisaaLaiteosa(kotelo);
		kooste2.laiteosat();
		System.out.println("Kokonaishinta: " + kooste2.hinta() + "€");

		// Kooste3
		Kooste kooste3 = new Kooste();
		kooste3.lisaaLaiteosa(muistipiiri);
		kooste3.lisaaLaiteosa(prosessori);
		kooste3.lisaaLaiteosa(emolevy);
		kooste3.lisaaLaiteosa(verkkokortti);
		kooste3.laiteosat();
		System.out.println("Kokonaishinta: " + kooste3.hinta() + "€");

	}
}
