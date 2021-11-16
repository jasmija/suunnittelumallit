package chainofresponsibility;

public class Päällikkö  extends Handler{

	public void handle(Palkankorotus korotus) {
		//System.out.println("Päällikkö");
		if(korotus.getKorotus() > 2 && korotus.getKorotus() <= 5) {
			System.out.println("Päällikkö hyväksyi " + korotus.getKorotus() +  "% palkankorotuksen.");
		}else {
			super.handle(korotus);
		}
	}
}
