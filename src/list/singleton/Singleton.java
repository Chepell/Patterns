package list.singleton;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Singleton {
	private static Singleton instance;

	// приватный конструктор
	private Singleton() {
	}

	// Ленивая инициализация только по требованию
	// ключевое слово synchronized для корректной работы с многопоточностью
	public static synchronized Singleton getInstance() {
		if (instance == null) instance = new Singleton();
		return instance;
	}

	public void print() {
		System.out.println(this);
	}
}
