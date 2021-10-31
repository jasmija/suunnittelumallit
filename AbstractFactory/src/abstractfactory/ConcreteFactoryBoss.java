package abstractfactory;

public class ConcreteFactoryBoss implements Abstractfactory{

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
