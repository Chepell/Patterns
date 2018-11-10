package list.state2;

import list.state2.context.Human;
import list.state2.states.WeekEnd;

/**
 * Artem Voytenko
 * 10.11.2018
 */

public class Main {
	public static void main(String[] args) {


		Human human = new Human();
		// устанавлюваю начальное состояние
		human.setState(new WeekEnd());

		// далее переход между состояниями происходит исходя из самих состояний
		// реализова график работы - 2 дня работаем, 3 отдыхаем
		for (int i = 0; i < 10; i++) {
			human.doSomething();
		}

	}
}
