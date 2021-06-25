package com.home.assignment;

public class AeropaneSeatingModule {

	private AeroplaneSeatManager seatManager;

	public AeropaneSeatingModule(int[][] config, AeroplaneSeatManager seatManager) {
		this.seatManager = seatManager;
		seatManager.init(config);
	}

	public AeroplaneSeatManager getSeatManager() {
		return seatManager;
	}
	
}
