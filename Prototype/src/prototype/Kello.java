package prototype;

public class Kello implements Cloneable {

	private Viisarit minuutit;
	private Viisarit tunnit;

	public Kello() {
		this.minuutit = new Viisarit();
		this.tunnit = new Viisarit();
	}

	public String getKellonaika() {
		return tunnit + ":" + minuutit;
	}

	public void asetaKellonaika(int tunnit, int minuutit) {
		this.tunnit.asetaViisarinaika(tunnit);
		this.minuutit.asetaViisarinaika(minuutit);
	}

	public Object matalakopio() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Kello syväkopio() {
		Kello kello = null;
		try {
			kello = (Kello)super.clone();
			kello.tunnit = (Viisarit) this.tunnit.clone();
			kello.minuutit = (Viisarit) this.minuutit.clone();
			return kello;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
