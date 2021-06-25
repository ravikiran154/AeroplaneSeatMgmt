package com.home.assignment;

public enum SeatType {

	MIDDLE(3), AISLE(1), WINDOW(2);

	private int priority;
	
	SeatType(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}
	
}
