package command;

public class YlosCommand implements Command{

	private Valokangas valokangas;
	
	public YlosCommand(Valokangas valokangas) {
		this.valokangas = valokangas;
	}
	
	@Override
	public void suoritaPainallus() {
		valokangas.valokangasYlös();
	}

}
