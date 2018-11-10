package list.state2.states;

import list.state2.context.Human;

/**
 * Artem Voytenko
 * 10.11.2018
 */

public class WeekEnd implements Activity {
	private int count;

	@Override
	public void doSomething(Human context) {
		if (count < 3) {
			System.out.println("Relax!!!");
			count++;
		} else {
			context.setState(new Work());
		}
	}
}
