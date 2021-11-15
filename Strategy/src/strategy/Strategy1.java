package strategy;

import java.util.List;

public class Strategy1 implements ListConverter {

	List list;

	// Rivinvaihto jokaisen alkion jälkeen
	// Listan oma get metodi
	@Override
	public String listToString(List l) {
		System.out.println("Strategy1");
		list = l;

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("/n");
		}
		return list.toString();
	}

}
