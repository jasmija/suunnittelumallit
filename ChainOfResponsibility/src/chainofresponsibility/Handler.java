package chainofresponsibility;

public abstract class Handler {

	private Handler palkankorotus;

	public void setHandler(Handler korotus) {
		this.palkankorotus = korotus;
	}

	public void handle(Palkankorotus korotus) {
		if (palkankorotus != null) {
			palkankorotus.handle(korotus);
		}
	}

}
