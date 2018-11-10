package list.observer.observers;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Observer2 extends AbstractObserver {

	public Observer2(String name) {
		super(name);
	}

	@Override
	public void doAction(String message) {
		System.out.println(message + " - get from RSS." + super.getName());
	}
}
