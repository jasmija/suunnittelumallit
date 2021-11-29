package builder;

public interface IBurgeriBuilder {

	public abstract void kokoaUusiBurgeri();
	
	public abstract void lisääTäyte();
	public abstract void lisääSämpylä();
	public abstract void lisääMajoneesi();
	public abstract void lisääPihvi();
	
	public abstract Object getBurgeri();
}
