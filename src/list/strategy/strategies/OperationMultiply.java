package list.strategy.strategies;

/**
 * Artem Voytenko
 * 10.11.2018
 */

public class OperationMultiply implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}
