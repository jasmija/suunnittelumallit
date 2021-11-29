package builder;

public class HesburgerBuilder implements IBurgeriBuilder {

	private Hesburger burgeri;
	
	public void kokoaUusiBurgeri() {
		burgeri = new Hesburger();
	}

	public void lisääTäyte() {
		burgeri.setTäyte("Juusto");
		System.out.println("Juusto lisätty");
	}

	public void lisääSämpylä() {
		burgeri.setSämpylä("Ruissämpylä");
		System.out.println("Ruissämpylä lisätty");
	}

	public void lisääMajoneesi() {
		burgeri.setMajoneesi("Kurkkumajoneesi");
		System.out.println("Kurkkumajoneesi lisätty");
	}

	public void lisääPihvi() {
		burgeri.setPihvi("Kasvispihvi");
		System.out.println("Kasvispihvi lisätty");
	}

	public Hesburger getBurgeri() {
		burgeri.getBurgeri();
		return burgeri;
	}
	
}
