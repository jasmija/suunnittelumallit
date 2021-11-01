package abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testi {

	public static void main(String[] args) {

		Class c = null;
		Abstractfactory factory = null;

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/properties.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			// luetaan toteuttava tehdas properties-tiedostosta
			c = Class.forName(properties.getProperty("tehdas"));
			factory = (Abstractfactory) c.getDeclaredConstructor().newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}

		AbstractTpaita tpaita = factory.createTpaita();
		AbstractFarmarit farmarit = factory.createFarmarit();
		AbstractLippis lippis = factory.createLippis();
		AbstractKengät kengät = factory.createKengät();

		System.out.println(farmarit.toString());
		System.out.println(kengät.toString());
		System.out.println(lippis.toString());
		System.out.println(tpaita.toString());
	}
}
