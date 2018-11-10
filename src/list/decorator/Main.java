package list.decorator;

import list.decorator.decorators.BorderDecorator;
import list.decorator.decorators.CatDecorator;
import list.decorator.decorators.ColorDecorator;
import list.decorator.objects.Cat;
import list.decorator.objects.Component;
import list.decorator.objects.Window;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("TIMKA");
		cat.showName();

		System.out.println();

		CatDecorator catDecorator = new CatDecorator(cat);
		catDecorator.showName();

		System.out.println();

		Component window = new Window();
		window.draw();

		System.out.println();

		Component borderDecorator = new BorderDecorator(window);
		Component colorDecorator = new ColorDecorator(window);
		borderDecorator.draw();
	}
}
