package list.observer.publishers;

import list.observer.observers.ObserverActionListener;

import java.util.ArrayList;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// класс издателя с реализацией интерфейса
public class Publisher implements PublisherInterface {
	// поле класса список всех наблюдателей
	private ArrayList<ObserverActionListener> observers = new ArrayList<>();

	@Override
	public ArrayList<ObserverActionListener> getObservers() {
		return observers;
	}

	@Override
	public void addObserver(ObserverActionListener observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ObserverActionListener listener) {
		observers.remove(listener);

	}

	@Override
	public void removeAllObservers() {
		observers.clear();
	}

	@Override
	public void notifyObserver(String message) {
		for (ObserverActionListener listener : observers) {
			listener.doAction(message);
		}
	}

	public void createNewMessage(String message) {
		System.out.println("Publisher print message: " + message);
		notifyObserver(message);
	}
}