package list.adapter.adapters;

import list.adapter.objects.Printer;

import java.util.List;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// Адаптер
public class PrinterAdapter implements PageListPrinter {
	// с помощью композиции создаю объект принтер
	private Printer printer = new Printer();

	// реализую метод интерфейса
	@Override
	public void print(List<String> list) {
		for (String text : list) {
			printer.print(text);
		}
	}
}
