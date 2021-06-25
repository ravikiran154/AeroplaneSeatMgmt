package com.home.assignment;

public class Seat {
	
	private int row;

	private int col;
	
	private SeatType seatType;
	
	private int seatGroupId;
	
	private int seatID;

	public Seat(int row, int col) {
		this.row = row;
		this.col = col;
	}
	

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public SeatType getSeatType() {
		return seatType;
	}


	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	
	public int getSeatGroupId() {
		return seatGroupId;
	}

	public void setSeatGroupId(int seatGroupId) {
		this.seatGroupId = seatGroupId;
	}


	public int getSeatID() {
		return seatID;
	}


	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}


	@Override
	public String toString() {
		return "[" + row + ", " + col + ", " + seatType + ", " + seatGroupId + ", " + seatID + "]";
	}


	
	
	
	
	

}
