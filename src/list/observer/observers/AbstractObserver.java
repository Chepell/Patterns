package list.observer.observers;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public abstract class AbstractObserver implements ObserverActionListener {
	private String name;

	public AbstractObserver(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


}
