package list.state2.states;

import list.state2.context.Human;

/**
 * Artem Voytenko
 * 10.11.2018
 */

public class Work implements Activity {
	private int count;

	@Override
	public void doSomething(Human context) {
		if (count < 2) {
			System.out.println("Work...");
			count++;
		} else {
			context.setState(new WeekEnd());
		}
	}
}
