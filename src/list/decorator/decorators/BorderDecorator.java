package list.decorator.decorators;

import list.decorator.objects.Component;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class BorderDecorator extends Decorator {

	public BorderDecorator(Component component) {
		super(component);
	}

	@Override
	public void afterDraw() {
		System.out.println("-------------");
	}
}
