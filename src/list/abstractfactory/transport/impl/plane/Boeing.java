package list.abstractfactory.transport.impl.plane;

import list.abstractfactory.transport.interfaces.Plane;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Boeing implements Plane {
	@Override
	public void flight() {
		System.out.println("Boeing flight");
	}
}
