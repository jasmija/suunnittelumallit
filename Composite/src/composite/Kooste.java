package composite;

import java.util.ArrayList;
import java.util.List;

public class Kooste implements Laiteosa {

	private List<Laiteosa> childLaiteosa;

	public Kooste() {
		this.childLaiteosa = new ArrayList<>();
	}

	public void lisaaLaiteosa(Laiteosa laiteosa) {
		childLaiteosa.add(laiteosa);
	}

	public int hinta() {
		int kokonaishinta = 0;
		for (int i = 0; i < childLaiteosa.size(); i++) {
			int hinta = childLaiteosa.get(i).hinta();
			kokonaishinta += hinta;
		}
		return kokonaishinta;
	}

	public void laiteosat() {
		System.out.println("Kokoonpanoon kuuluu: ");
		for (int i = 0; i < childLaiteosa.size(); i++) {
			System.out.println(
					childLaiteosa.get(i).getClass().getSimpleName() + " " + childLaiteosa.get(i).hinta() + "€");
		}
	}

}
