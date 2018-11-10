package list.strategy;

import list.strategy.context.Context;
import list.strategy.strategies.OperationAdd;
import list.strategy.strategies.OperationMultiply;
import list.strategy.strategies.OperationSubstract;

/**
 * Artem Voytenko
 * 10.11.2018
 */

public class Main {
	public static void main(String[] args) {
		OperationAdd add = new OperationAdd();
		Context context = new Context(add);
		int i = context.executeStrategy(11, 7);
		System.out.println(i);

		OperationMultiply multiply = new OperationMultiply();
		context = new Context(multiply);
		i = context.executeStrategy(11, 7);
		System.out.println(i);

		OperationSubstract substract = new OperationSubstract();
		context = new Context(substract);
		i = context.executeStrategy(11, 7);
		System.out.println(i);
	}
}
