package list.state;

import list.state.context.TVset;
import list.state.states.Bbc;

/**
 * Artem Voytenko
 * 09.11.2018
 */

public class Main {
	public static void main(String[] args) {

		TVset tVset = new TVset();
		Bbc bbc = new Bbc();
		tVset.setChannel(bbc);

		for (int i = 0; i < 8; i++) {
			tVset.watch();
			tVset.nextChannel();
		}

	}
}
