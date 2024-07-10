package creationaldesignpattern.factorypattern;

public class Ford extends Car{

	@Override
	public String switchOn() {
		return "Ford Car switched on...";
	}

	@Override
	public String switchOff() {
		return "Ford Car switched off...";
	}

}
