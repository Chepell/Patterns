package list.adapter.adapters;

import java.util.List;

/**
 * Artem Voytenko
 * 08.11.2018
 */

// интерфейс для печати списком, а не по одному документу
public interface PageListPrinter {
	void print(List<String> list);
}
