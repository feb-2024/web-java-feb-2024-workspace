package creationaldesignpattern.factorypattern;

public class Demo {

	public static void main(String[] args) {
		Factory factory1 = new ToyotaFactory();
		Toyota toyotaCar = (Toyota) factory1.manufactureCar();
		System.out.println(toyotaCar.switchOn());
		System.out.println(toyotaCar.switchOff());
		
		Factory factory2 = new FordFactory();
		Ford fordCar = (Ford) factory2.manufactureCar();
		System.out.println(fordCar.switchOn());
		System.out.println(fordCar.switchOff());
	}

}
