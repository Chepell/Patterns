package list.facade.objects;

import list.facade.parts.Door;
import list.facade.parts.Ignition;
import list.facade.parts.Wheel;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class CarFacade {
	// C помощью композиции реализую функциональность все машины
	private Door door;
	private Ignition ignition;
	private Wheel wheel;

	// иницализация полей в конструкторе
	public CarFacade() {
		door = new Door();
		ignition = new Ignition();
		wheel = new Wheel();
	}

	// фасадный метод
	public void go() {
		door.open();
		ignition.start();
		wheel.turn();
	}
}
