package list.factorymethod;

import list.factorymethod.cars.Car;
import list.factorymethod.factory.CarFactory;
import list.factorymethod.factory.RoadType;

import java.util.ArrayList;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Main {
	public static void main(String[] args) {
		// список для всех транспортных средств
		ArrayList<Car> cars = new ArrayList<>();

		// создание с помщью фабрики для конкртеного типа дороги
		Car car1 = CarFactory.getCar(RoadType.AVTOBAN);
		Car car2 = CarFactory.getCar(RoadType.СITY);
		Car car3 = CarFactory.getCar(RoadType.OFF_ROAD);

		// добавление всех ТС в список
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);

		// в цикле вызов у всех ТС из списка метода start()
		for (Car car : cars) {
			// благодаря полиморфизму метод вызвается для объекта конкретного класса
			car.start();
		}
	}
}
