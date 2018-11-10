package list.abstractfactory;

import list.abstractfactory.impl.FactoryEU;
import list.abstractfactory.impl.FactoryForCountry;
import list.abstractfactory.interfaces.TransportFactory;
import list.abstractfactory.transport.interfaces.Car;
import list.abstractfactory.transport.interfaces.Plane;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Main {
	public static void main(String[] args) {

		TransportFactory factoryEU = new FactoryForCountry(Country.EU);
		Car car = factoryEU.createCar();
		Plane plane = factoryEU.createPlane();
		car.drive();
		plane.flight();


		TransportFactory factoryUSA = new FactoryForCountry(Country.USA);
		Car car1 = factoryUSA.createCar();
		Plane plane1 = factoryUSA.createPlane();
		car1.drive();
		plane1.flight();

	}
}
