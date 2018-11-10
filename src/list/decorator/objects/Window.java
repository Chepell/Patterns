package list.decorator.objects;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Window implements Component {
	@Override
	public void draw() {
		System.out.println("Draw window");
	}
}
