package list.factorymethod.cars;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Porsche implements Car {

	@Override
	public void start() {
		System.out.println("Drive speed 170 km/h");
	}

	@Override
	public void stop() {
		System.out.println("Stopped at 1 sec");
	}
}
