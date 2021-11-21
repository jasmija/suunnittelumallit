package momento;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        Asiakas[] arvaajat = new Asiakas[3];       
        arvaajat[0] = new Asiakas("Nasu", arvuuttaja);
        arvaajat[1] = new Asiakas("Ihaa", arvuuttaja);
        arvaajat[2] = new Asiakas("Tiikeri", arvuuttaja);

        for (int i = 0; i < arvaajat.length; i++) {
            arvaajat[i].start();          
        }

       for (int i = 0; i < arvaajat.length; i++) {
            arvaajat[i].join();          
        }                                    
    }

}
