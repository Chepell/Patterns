package list.abstractfactory.transport.impl.car;

import list.abstractfactory.transport.interfaces.Car;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Audi implements Car {
	@Override
	public void drive() {
		System.out.println("Audi drive");
	}

	@Override
	public void stop() {
		System.out.println("Audi stop");
	}
}
