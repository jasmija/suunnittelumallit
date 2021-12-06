package prototype;

public class Main {

	public static void main(String[] args) {
	
		Kello kello = new Kello();
		kello.asetaKellonaika(13, 30);
		
		Kello matalakello = (Kello) kello.matalakopio();
		
		Kello syväkello = kello.syväkopio();
		
		System.out.println("Kello: " + kello.getKellonaika().toString() + " Matalakello: " + matalakello.getKellonaika() + " Syväkello: " + syväkello.getKellonaika());
		
		kello.asetaKellonaika(13, 30);
		System.out.println("Kello: " + kello.getKellonaika() + " Matalakello: " + matalakello.getKellonaika() + " Syväkello: " + syväkello.getKellonaika());
		
		matalakello.asetaKellonaika(16, 11);
		System.out.println("Kello: " + kello.getKellonaika() + " Matalakello: " + matalakello.getKellonaika() + " Syväkello: " + syväkello.getKellonaika());
		
		syväkello.asetaKellonaika(19, 36);
		System.out.println("Kello: " + kello.getKellonaika() + " Matalakello: " + matalakello.getKellonaika() + " Syväkello: " + syväkello.getKellonaika());
		
	}
}
