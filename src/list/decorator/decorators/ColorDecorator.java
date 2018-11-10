package list.decorator.decorators;

import list.decorator.objects.Component;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class ColorDecorator extends Decorator {

	public ColorDecorator(Component component) {
		super(component);
	}

	// реализация метода абстрактного класса
	@Override
	public void afterDraw() {
		System.out.println("...after color");
	}
}
