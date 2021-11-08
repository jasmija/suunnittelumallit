package abstractfactory;

public class ConcreteFactoryAdidas{
	
	private static ConcreteFactoryAdidas INSTANCE = null;

	private ConcreteFactoryAdidas(){}

	public static ConcreteFactoryAdidas getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ConcreteFactoryAdidas();
		}
		return INSTANCE;
	}
	
	public AdidasLippis createLippis() {
		return new AdidasLippis();
	}

	public AdidasFarmarit createFarmarit() {
		return new AdidasFarmarit();
	}

	public AdidasKengät createKengät() {
		return new AdidasKengät();
	}

	public AdidasTpaita createTpaita() {
		return new AdidasTpaita();
	}

}
