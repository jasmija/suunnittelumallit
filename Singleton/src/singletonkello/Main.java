package singletonkello;

public class Main {

	public static void main(String[] args) {

		Kello kello = Kello.getInsatance();
		kello.setAika(0);
		
		while (true) {
			try {
				Thread.sleep(3000);
				kello.setAika(kello.getAika() + 3);
				System.out.println("Ohjelman alusta kulunut: " + kello.getAika());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
