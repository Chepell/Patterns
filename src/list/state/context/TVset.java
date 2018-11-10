package list.state.context;

import list.state.states.Bbc;
import list.state.states.Channel;
import list.state.states.Discovery;
import list.state.states.Mtv;

/**
 * Artem Voytenko
 * 10.11.2018
 */

// класс контекста, Телек
public class TVset {
	// конкретный канал, его состояние
	private Channel channel;

	// устанавливае состояние контекста
	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	// изменяет состояние контекста
	public void nextChannel() {
		if (channel instanceof Discovery) {
			channel = new Mtv();
		} else if (channel instanceof Mtv) {
			channel = new Bbc();
		} else if (channel instanceof Bbc) {
			channel = new Discovery();
		}
	}

	public void watch() {
		channel.show();
	}

}
