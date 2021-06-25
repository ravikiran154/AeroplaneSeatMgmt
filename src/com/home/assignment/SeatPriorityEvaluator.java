package com.home.assignment;

import java.util.PriorityQueue;
import java.util.Queue;

public class SeatPriorityEvaluator {

	private Queue<Seat>inventory;

	public SeatPriorityEvaluator() {
		inventory = new PriorityQueue<>(new SeatComparator());
	}
	
	public void add(Seat seat) {
		inventory.add(seat);
	}

	public Seat get() {
		return inventory.poll();
	}
	
}
