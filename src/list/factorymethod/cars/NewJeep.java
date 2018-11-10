package list.factorymethod.cars;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class NewJeep extends Jeep {

	public void newFunction() {
		System.out.println("new function");
	}

	@Override
	public void start() {
		System.out.println("Drive speed 45 km/h");
	}
}
