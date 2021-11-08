package singletonkello;

public class Kello {

	private int aika;

	// Staattinen muuttuja joka on tyypiltään kello
	private static Kello INSTANCE = null;

	// Korstruktori on private eikä siihen pääse käsiksi muualta
	private Kello() {
	}

	// Metodi joka luo instanssin Kello luokasta
	public static Kello getInsatance() {
		if (INSTANCE == null) {
			INSTANCE = new Kello();
		}
		return INSTANCE;
	}

	public int getAika() {
		return aika;
	}

	public void setAika(int aika) {
		this.aika = aika;
	}
}
