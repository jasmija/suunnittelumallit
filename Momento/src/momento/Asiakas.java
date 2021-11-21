package momento;


public class Asiakas extends Thread {

	private int arvaus;
	private String nimi;
	private Arvuuttaja arvuuttaja;
	private Object memento;
	private boolean arvuuttelu = true;

	public Asiakas(String n, Arvuuttaja a) {
		this.nimi = n;
		this.arvuuttaja = a;
	}

	@Override
	public void run() {

		arvuuttaja.liityPeliin(this);
		System.out.println(nimi + " liittyi peliin");
		System.out.println();

		while (arvuuttelu) {
			int arvaus = (int) Math.round(Math.random() * 10);
			arvaa(arvaus);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void setArvaus(int arvaus) {
		this.arvaus = arvaus;
	}

	public int getArvaus() {
		return arvaus;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void arvattavaNumero(Object memento) {
		this.memento = memento;
	}

	public void arvaa(int numero) {
		arvuuttaja.onkoArvausOikein(this, numero);
	}

	public Object mementoArvuuttajalle() {
		return memento;
	}
	
	public void lopeta() {
		arvuuttelu = false;
	}

}
