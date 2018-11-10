package list.abstractfactory.impl;

import list.abstractfactory.Country;
import list.abstractfactory.interfaces.TransportFactory;
import list.abstractfactory.transport.interfaces.Car;
import list.abstractfactory.transport.interfaces.Plane;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// класс реализации абстрактной фабрики
public class FactoryForCountry implements TransportFactory {
	private TransportFactory factory;

	public FactoryForCountry(Country country) {
		switch (country) {
			case EU:
				factory = new FactoryEU();
				break;
			case USA:
				factory = new FactoryUSA();
				break;
		}
	}

	@Override
	public Car createCar() {
		return factory.createCar();
	}

	@Override
	public Plane createPlane() {
		return factory.createPlane();
	}
}
