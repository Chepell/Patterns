package list.observer.publishers;

import list.observer.observers.ObserverActionListener;

import java.util.ArrayList;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// интерфейс для реализации в паблишере
public interface PublisherInterface {
	// получить список всех наблюдателей
	ArrayList<ObserverActionListener> getObservers();
	// добавить наблюдателя
	void addObserver(ObserverActionListener observer);
	// удалить наблюдателя
	void removeObserver(ObserverActionListener observer);
	// удалить всех наблюдателей
	void removeAllObservers();
	// уведомить наблюдателя
	void notifyObserver(String message);

}
