package command;

public class Seinapainike {

	Command command;

	public Seinapainike(Command cmd){
		this.command = cmd;
	}
	
	public void paina() {
		command.suoritaPainallus();
	}
}
