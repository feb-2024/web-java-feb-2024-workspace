package creationaldesignpattern.factorypattern;

public class ToyotaFactory extends Factory{
	@Override
	public Car manufactureCar() {
		return new Toyota();
	}
}
