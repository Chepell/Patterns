package list.singleton;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Main {
	public static void main(String[] args) {
		// СОздание объекта
		Singleton instance = Singleton.getInstance();
		instance.print(); // list.singleton.Singleton@1e643faf


		// В данном случае объект уже не создается, а возвращается существующий
		Singleton newInstance = Singleton.getInstance();
		newInstance.print(); // list.singleton.Singleton@1e643faf
	}
}
