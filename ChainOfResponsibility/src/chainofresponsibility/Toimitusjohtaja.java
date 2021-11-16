package chainofresponsibility;

public class Toimitusjohtaja extends Handler{

	public void handle(Palkankorotus korotus) {
		//System.out.println("Toimitusjohtaja");
		if(korotus.getKorotus() > 5 && korotus.getKorotus() <= 10) {
			System.out.println("Toimitusjohtaja hyväksyi " + korotus.getKorotus() +  "% palkankorotuksen.");
		}else {
			System.out.println("Toimitusjohtaja ei hyväksynyt " + korotus.getKorotus() +  "% palkankorotusta. Palkankorotusta myönnetään max 10%.");
		}
	}
}
