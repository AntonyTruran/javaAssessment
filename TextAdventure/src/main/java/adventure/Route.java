package adventure;

import java.util.Scanner;

public class Route {
	public String journey(Findings search, int targetDirection, double currentDistence) {
		Direction direction = new Direction();
		int currentDirection = 0;
		boolean found = false;
		while (found != true) {
			System.out.println("which way will you go? (type north south east or west to travel).\r\n"
					+ "or type search to investigate the area.");
			Scanner chosenDirection = new Scanner(System.in);
			String moving = chosenDirection.nextLine();
			if (moving.toLowerCase().equals("north") || moving.toLowerCase().equals("n")) {
				currentDirection = 1;
				currentDistence = direction.distence(currentDistence, targetDirection, currentDirection);
			} else if (moving.toLowerCase().equals("east") || moving.toLowerCase().equals("e")) {
				currentDirection = 2;
				currentDistence = direction.distence(currentDistence, targetDirection, currentDirection);
			} else if (moving.toLowerCase().equals("south") || moving.toLowerCase().equals("s")) {
				currentDirection = 3;
				currentDistence = direction.distence(currentDistence, targetDirection, currentDirection);
			} else if (moving.toLowerCase().equals("west") || moving.toLowerCase().equals("w")) {
				currentDirection = 4;
				currentDistence = direction.distence(currentDistence, targetDirection, currentDirection);
			} else if (moving.toLowerCase().equals("search")) {
				found = search(search, found, currentDistence);
			} else {
				System.out.println("please enter the full word");
			}
		}
		return "game over";
	}

	private boolean search(Findings search, boolean found, double currentDistence) {
		if (currentDistence == 0.0) {
			found = true;
			System.out.println(
					"Atop a small hill you see a dark but regal figure, they speak to you offering you a release from this place, at a price.");
			search.finalChoice();
			search.finalInventory();
		} else {
			search.newItem();
		}
		return found;
	}
}
