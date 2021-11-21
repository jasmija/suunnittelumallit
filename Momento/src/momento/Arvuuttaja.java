package momento;

public class Arvuuttaja {
	
	public Arvuuttaja() {
		
	}

	// arvuuttaja palauttaa asiakkaalle Mementon, jossa on arvottu luku
    public void liityPeliin(Asiakas arvaaja){ 
        arvaaja.arvattavaNumero(new Memento((int) (Math.random() * 10)));
    }
	
    // tarkistetaan menikö arvaus oikein, asiakkaalta saadaan momenton kautta arvaus arvuuttajalle
	public void onkoArvausOikein(Asiakas asiakas, int arvaus) {
		 Memento memento = (Memento) asiakas.mementoArvuuttajalle();

	        if(memento.getOikeaNumero() == arvaus) {  
	            System.out.println(asiakas.getNimi() + " arvaus: " + arvaus + " on oikein!\n");
	            asiakas.lopeta();
	        } else {
	            System.out.println(asiakas.getNimi() + " arvaus: " + arvaus + " on väärin!\n");
	        }

	}
	
	// Momento
	private class Memento {
        private final int arvattavanumero;

        public Memento(int numero){
            arvattavanumero = numero;
        }

        public int getOikeaNumero(){
            return arvattavanumero;
        }
    }

}
