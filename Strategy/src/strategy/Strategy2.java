package strategy;

import java.util.List;

public class Strategy2 implements ListConverter {

	// Rivinvaihto jokatoisen alkion jälkeen
	// Lista taulukoksi
	@Override
	public String listToString(List list) {
		System.out.println("Strategy2");
		List lista = list;
		int koko = lista.size();
		String[] taulukko = new String[koko];

		for (int i = 0; i < koko; i++) {
			taulukko[i] = lista.get(i).toString();
		}

		int rivinvaihto = 0;
		for (int i = 0; i < taulukko.length; i++) {
			rivinvaihto++;
			int jakojaannos = i % 2;
			if (jakojaannos == 0) {
				System.out.println("/n");
			}
			System.out.println(taulukko[i]);
		}
		return list.toString();
	}
}
