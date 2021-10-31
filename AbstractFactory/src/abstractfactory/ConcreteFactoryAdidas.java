package abstractfactory;

public class ConcreteFactoryAdidas implements Abstractfactory{

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
