package list.state2.context;

import list.state2.states.Activity;

/**
 * Artem Voytenko
 * 10.11.2018
 */

public class Human {
	private Activity state;

	public void setState(Activity state) {
		this.state = state;
	}

	public void doSomething() {
		state.doSomething(this);
	}
}
