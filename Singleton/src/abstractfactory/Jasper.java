package abstractfactory;

public class Jasper {
	
	AbstractFarmarit farmarit;
	AbstractKengät kengät;
	AbstractLippis lippis;
	AbstractTpaita tpaita;

	ConcreteFactoryAdidas factory = ConcreteFactoryAdidas.getInstance();
	ConcreteFactoryBoss factoryBoss = ConcreteFactoryBoss.getInstance();
	
	public Jasper() {
		farmarit = factory.createFarmarit();
		kengät = factory.createKengät();
		lippis = factory.createLippis();
		tpaita = factory.createTpaita();
	}
	
	public void getVaatteet() {
		System.out.println(farmarit.toString());
		System.out.println(kengät.toString());
		System.out.println(lippis.toString());
		System.out.println(tpaita.toString());
	}

	public void vaihdaVaatteet() {
		farmarit = factoryBoss.createFarmarit();
		kengät = factoryBoss.createKengät();
		lippis = factoryBoss.createLippis();
		tpaita = factoryBoss.createTpaita();
		
		farmarit = factoryBoss.createFarmarit();
		kengät = factoryBoss.createKengät();
		lippis = factoryBoss.createLippis();
		tpaita = factoryBoss.createTpaita();
	}

}
