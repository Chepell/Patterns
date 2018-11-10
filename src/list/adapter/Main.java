package list.adapter;

import list.adapter.adapters.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Artem Voytenko
 * 08.11.2018
 */

public class Main {
	public static void main(String[] args) {
		List<String> texts = new ArrayList<>();
		texts.add("text1");
		texts.add("text2");
		texts.add("text3");
		texts.add("text4");

		// создаю адаптер для принтера
		PrinterAdapter printerAdapter = new PrinterAdapter();
		// вызываю метод адаптера, который адаптирует список к печати в обычном принтере
		printerAdapter.print(texts);
	}
}
