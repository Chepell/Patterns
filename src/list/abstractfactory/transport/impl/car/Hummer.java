package list.abstractfactory.transport.impl.car;

import list.abstractfactory.transport.interfaces.Car;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Hummer implements Car {
	@Override
	public void drive() {
		System.out.println("Hummer drive");
	}

	@Override
	public void stop() {
		System.out.println("Hummer stop");
	}
}
