package list.observer.observers;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Observer1 extends AbstractObserver {

	public Observer1(String name) {
		super(name);
	}

	@Override
	public void doAction(String message) {
		System.out.println(message +" - get from Telegram." + super.getName());
	}
}
