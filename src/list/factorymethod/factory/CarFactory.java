package list.factorymethod.factory;

import list.factorymethod.cars.Car;
import list.factorymethod.cars.Jeep;
import list.factorymethod.cars.NewJeep;
import list.factorymethod.cars.Porsche;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// фабрика по созданию объектов интерфейса Car
public class CarFactory {

	// фабричный метод
	public static Car getCar(RoadType roadType) {
		Car car = null;
		switch (roadType) {
			case СITY:
				car = new Jeep();
				break;
			case OFF_ROAD:
				car = new NewJeep();
				break;
			case AVTOBAN:
				car = new Porsche();
				break;
		}
		return car;
	}
}
