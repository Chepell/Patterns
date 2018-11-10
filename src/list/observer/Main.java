package list.observer;

import list.observer.publishers.Publisher;
import list.observer.observers.Observer1;
import list.observer.observers.Observer2;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Main {
	public static void main(String[] args) {
		Publisher publisher = new Publisher();
		publisher.addObserver(new Observer1("John"));
		publisher.addObserver(new Observer2("Mike"));
		publisher.addObserver(new Observer2("Alice"));
		publisher.addObserver(new Observer1("Rachel"));


		publisher.notifyObserver("This is a new post!");
	}
}
