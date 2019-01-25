package adventure;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println(
				"As you fall from a fatal wound, calling to the dark for salvation a voice seems to answers.\r\n"
						+ "Suddenly you come to,your vision clouded with crimson, with grey foggy clouds floating oppressively close to you, \r\n"
						+ "reflecting in the murky grey water which reaches up your shins. A number of black plants barely poking out of the shallow water.\r\n"
						+ "You look down and noice a mark on your hand displaying a number, but it doesn't seem to be the time, and you feel a call from amidst the grey mists.");
		EndPoint distence = new EndPoint();
		int targetDirection = distence.targetDirection();
		double currentDistence = distence.targetDistence();
		Findings search = new Findings();
		Route route = new Route();
		System.out.println(route.journey(search, targetDirection, currentDistence));
	}

}
