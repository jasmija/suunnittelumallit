package command;

public class AlasCommand implements Command{

	private Valokangas valokangas;
	
	public AlasCommand(Valokangas valokangas) {
		this.valokangas = valokangas;
	}
	
	@Override
	public void suoritaPainallus() {
		valokangas.valokangasAlas();
	}
}
