package chainofresponsibility;

public class Lähiesimies extends Handler {

	public void handle(Palkankorotus korotus) {
		//System.out.println("Lähiesimies");
		if(korotus.getKorotus() <= 2) {
			System.out.println("Lähiesimies hyväksyi " + korotus.getKorotus() +  "% palkankorotuksen.");
		}else {
			super.handle(korotus);
		}
	}

}
