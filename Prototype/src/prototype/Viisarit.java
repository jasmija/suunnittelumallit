package prototype;

public class Viisarit implements Cloneable {

	private int aika;

	public Viisarit() {
		this.aika = 0;
	}

	public void asetaViisarinaika(int aika) {
		this.aika = aika;
	}

	public int getAika() {
		return this.aika;
	}

	public String toString() {
		return String.valueOf(this.aika);
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
