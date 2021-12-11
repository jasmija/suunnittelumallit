package facade;

public class ComputerFacade {
	
	//Ladataan paikasta a paikkaan b tietoa ja sitten näytetään tieto
	
	CPU cpu = new CPU();
	Memory memory = new Memory();
	HardDrive hardDrive = new HardDrive();
	
	private long kBootAddress = 116;
	private long kBootSector = 116;
	private int kSectorSize = 512;

	public void start() {
		cpu.Freeze();
		memory.Load(kBootAddress, hardDrive.Read(kBootSector, kSectorSize));
		cpu.Jump(kBootAddress);
		cpu.Execute();
	}
}
