package adventure;

public class Direction {
	public double distence(double currentDistence, int targetDirection, int currentDirection) {
		int oppositeDirection = oppositeDirection(targetDirection);
		double newDistence = currentDistence;
		double travelledTowardsAway = 1.0;
		double travelledOtherAway = 0.5;
		double travelledOtherTowards = 0.5;
		if (currentDirection == targetDirection) {
			newDistence = currentDistence - travelledTowardsAway;
		} else if (currentDirection == oppositeDirection) {
			newDistence = currentDistence + travelledTowardsAway;
		} else if (currentDirection == targetDirection + 1 || currentDirection + 1 == 5) {
			newDistence = currentDistence - travelledOtherTowards;
		} else if (currentDirection == targetDirection - 1 || currentDirection - 1 == 0) {
			newDistence = currentDistence + travelledOtherAway;
		}
		System.out.println("The number on the mark changes to " + newDistence + "m");
		return newDistence;
	}

	private Integer oppositeDirection(int targetDirection) {
		int oppositeDirection = 0;
		if (targetDirection == 1) {
			return oppositeDirection = 3;
		} else if (targetDirection == 2) {
			return oppositeDirection = 4;
		} else if (targetDirection == 3) {
			return oppositeDirection = 1;
		} else if (targetDirection == 4) {
			return oppositeDirection = 2;
		}
		return oppositeDirection;
	}
}