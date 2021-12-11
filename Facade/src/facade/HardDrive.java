package facade;

public class HardDrive {
	
	//Täältä luetaan alkuperäinen data
	
	public char Read(long lba, int size) {
		System.out.println("Reading from hard drive " + lba + " size " + size);
		return (char) lba;
	}
	
}
