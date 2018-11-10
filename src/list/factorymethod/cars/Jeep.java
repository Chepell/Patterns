package list.factorymethod.cars;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Jeep implements Car {

	@Override
	public void start() {
		System.out.println("Drive speed 50 km/h");
	}

	@Override
	public void stop() {
		System.out.println("Stopped at 5 sec");
	}
}
