package creationaldesignpattern.factorypattern;

public class Toyota extends Car{

	@Override
	public String switchOn() {
		return "Toyota Car switched on...";
	}

	@Override
	public String switchOff() {
		return "Toyota Car switched off...";
	}
}
