package list.facade;

import list.facade.objects.CarFacade;
import list.facade.parts.Door;
import list.facade.parts.Ignition;
import list.facade.parts.Wheel;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Main {
	public static void main(String[] args) {
		// без фасада
		Door door = new Door();
		door.open();

		Ignition ignition = new Ignition();
		ignition.start();

		Wheel wheel = new Wheel();
		wheel.turn();

		System.out.println();

		// c фасадом
		CarFacade carFacade = new CarFacade();
		carFacade.go();

	}
}
