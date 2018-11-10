package list.decorator.objects;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// есть класс, у которого есть метод выводящий на консоль им
// нужно изменить поведение этого метода не изменяя сам метод
public class Cat {
	private String name;

	public Cat() {

	}

	public Cat(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.print(name);
	}

	public String getName() {
		return name;
	}
}
