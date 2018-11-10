package list.abstractfactory.impl;

import list.abstractfactory.interfaces.TransportFactory;
import list.abstractfactory.transport.impl.car.Audi;
import list.abstractfactory.transport.impl.plane.Airbus;
import list.abstractfactory.transport.interfaces.Car;
import list.abstractfactory.transport.interfaces.Plane;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class FactoryEU implements TransportFactory {
	@Override
	public Car createCar() {
		return new Audi();
	}

	@Override
	public Plane createPlane() {
		return new Airbus();
	}
}
