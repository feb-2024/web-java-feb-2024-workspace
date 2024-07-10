package creationaldesignpattern.factorypattern;

public class FordFactory extends Factory{

	@Override
	public Car manufactureCar() {
		return new Ford();
	}

}
