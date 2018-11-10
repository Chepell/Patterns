package list.abstractfactory.impl;

import list.abstractfactory.interfaces.TransportFactory;
import list.abstractfactory.transport.impl.car.Hummer;
import list.abstractfactory.transport.impl.plane.Boeing;
import list.abstractfactory.transport.interfaces.Car;
import list.abstractfactory.transport.interfaces.Plane;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class FactoryUSA implements TransportFactory {
	@Override
	public Car createCar() {
		return new Hummer();
	}

	@Override
	public Plane createPlane() {
		return new Boeing();
	}
}
