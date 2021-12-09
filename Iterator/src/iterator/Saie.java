package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Saie extends Thread {

	private ArrayList list;
	Iterator iterator;
	
	public Saie(Iterator iterator) {
		System.out.println("Saie luotu");
		this.iterator = iterator;
	}

	//a) ja c)
	public void run() {
		System.out.println("Säie käynnissä...");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	//b)
	/*public void run() {
		System.out.println("Säie käynnissä...");
		
		synchronized(iterator) {
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}*/
		
}
