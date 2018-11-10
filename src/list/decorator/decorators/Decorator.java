package list.decorator.decorators;

import list.decorator.objects.Component;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// абстрактный класс для декоратора
public abstract class Decorator implements Component {
	protected Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	public abstract void afterDraw();

	// переопределение метода интерфейса
	@Override
	public void draw() {
		afterDraw();
		// вызываю метод компонента
		component.draw();
		afterDraw();
	}
}
