package adventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Findings {
	private static ArrayList<String> inventory = new ArrayList<>();

	public String newItem() {
		String[] items = { "nothing", "a rusty sword", "an old book with arcane scrawlings", "a dead fish",
				"a skeleton trapped under rocks", "a broken spear", "a rusted holy symbol", "a wizards staff",
				"a rusted suit of chain armour", "a dragons claw", "a moldy old book" };
		int randomObject = new Random().nextInt(items.length);
		String newItem = items[randomObject];
		System.out.println("Asside from the dark waters and withered plants you find " + newItem + "\r\n");
		System.out.println("Would you like to pick up this object? (yes/no)");

		Scanner itemCollection = new Scanner(System.in);
		String addItem = itemCollection.nextLine();
		if (addItem.toLowerCase().equals("yes")) {
			inventory.add(newItem);
		}
		return newItem;
	}

	public String finalChoice() {
		System.out
				.println("The figure offers you two choices to search for knowledge (type tomb) or power(type blade)");
		Scanner finalItem = new Scanner(System.in);
		String pactItem = finalItem.nextLine();
		if (pactItem.toLowerCase().equals("tomb")) {
			pactItem = "the vampiric tomb";
			inventory.add(pactItem);
			System.out.println(
					"You awake back on the material plane your body wracked with pain, but you are alive, but the cost of your survival is yet to be discovered");
		} else if (pactItem.toLowerCase().equals("blade")) {
			pactItem = "a soulbound blade";
			inventory.add(pactItem);
			System.out.println(
					"You awake back on the material plane your body wracked with pain, but you are alive, but the cost of your survival is yet to be discovered");
		} else {
			System.out.println("Dissapointed by your refusial the figure dissapears, and allows your soul to depart");
		}
		return null;
	}

	public <inventory> String finalInventory() {
		System.out.println("You collected:\r\n");
		List<Object> fullInventory = inventory.stream().filter(string -> !string.isEmpty())
				.collect(Collectors.toList());

		for (String item : inventory) {
			System.out.println(item);
		}
		return null;
	}
}
