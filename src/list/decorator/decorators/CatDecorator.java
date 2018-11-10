package list.decorator.decorators;

import list.decorator.objects.Cat;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// реализация декоратора наследуется от базового класса
public class CatDecorator extends Cat {
	// в поле объект оригинального класса, который нужно декарировать
	private Cat original;

	public CatDecorator(Cat cat) {
		this.original = cat;
	}

	// переопределяю метод класса родителя
	@Override
	public void showName() {
		String name = original.getName();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length() + 2; i++) {
			sb.append("*");
		}
		String line = sb.toString();

		System.out.println();
		System.out.println(line);
		System.out.print("*");
		original.showName();
		System.out.println("*");
		System.out.println(line);
	}
}
