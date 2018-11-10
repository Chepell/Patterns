package list.abstractfactory.interfaces;

import list.abstractfactory.transport.interfaces.Car;
import list.abstractfactory.transport.interfaces.Plane;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// фабрика по созданию ТС
public interface TransportFactory {
	Car createCar();

	Plane createPlane();
}
