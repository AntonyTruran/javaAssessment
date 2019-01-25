package adventure;

import java.util.Random;

public class EndPoint {
	public Integer targetDirection() {
		int totalDirection = new Random().nextInt(4)+1; 
		return totalDirection;
	}

	public int targetDistence() {
		int totalDistence = new Random().nextInt(10)+1;
		return totalDistence;
	}
}
