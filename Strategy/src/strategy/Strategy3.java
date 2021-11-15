package strategy;

import java.util.List;
import java.util.ListIterator;

public class Strategy3 implements ListConverter {

	@Override
	public String listToString(List list) {
		System.out.println("Strategy3");
		List lista = list;
		ListIterator<String> iterator = null;
		iterator = lista.listIterator();

		int i = 0;
		while (iterator.hasNext()) {
			i++;
			int jakojaannos = i % 3;
			if (jakojaannos == 0) {
				System.out.println("/n");
			}
			System.out.println(iterator.next());
		}
		return lista.toString();
	}
}
