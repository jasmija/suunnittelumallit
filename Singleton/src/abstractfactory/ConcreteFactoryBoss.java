package abstractfactory;

public class ConcreteFactoryBoss implements Abstractfactory{
	
	private static ConcreteFactoryBoss INSTANCE = null;

	private ConcreteFactoryBoss(){}

	public static ConcreteFactoryBoss getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ConcreteFactoryBoss();
		}
		return INSTANCE;
	}

	public BossLippis createLippis() {
		return new BossLippis();
	}

	public BossFarmarit createFarmarit() {
		return new BossFarmarit();
	}

	public BossKengät createKengät() {
		return new BossKengät();
	}

	public BossTpaita createTpaita() {
		return new BossTpaita();
	}
}
