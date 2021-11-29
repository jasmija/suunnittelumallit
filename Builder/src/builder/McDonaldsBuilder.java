package builder;

public class McDonaldsBuilder implements IBurgeriBuilder{

	private McDonalds burgeri;

	public void kokoaUusiBurgeri() {
		burgeri = new McDonalds();
	}

	public void lisääTäyte() {
		burgeri.setTäyte("Tomaatti");
		System.out.println("Tomaatti lisätty");
	}

	public void lisääSämpylä() {
		burgeri.setSämpylä("Vehnäsämpylä");
		System.out.println("Vehnäsämpylä lisätty");
	}

	public void lisääMajoneesi() {
		burgeri.setMajoneesi("Chilimajoneesi");
		System.out.println("Chilimajoneesi lisätty");
	}

	public void lisääPihvi() {
		burgeri.setPihvi("Lihapihvi");
		System.out.println("Lihapihvi lisätty");
	}

	public McDonalds getBurgeri() {
		burgeri.getBurgeri();
		return burgeri;
	}

}
