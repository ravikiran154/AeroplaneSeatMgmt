package com.home.assignment;

public class SeatGroup {

	private Seat[][] seatGroup;
	
	private int seatGroupId;
	
	private int maxRow;
	
	private int maxCol;
	
	private boolean isFirst;
	
	private boolean islast;

	public SeatGroup(int maxRow ,int maxCol, int seatGroupId) {
		seatGroup = new Seat[maxRow][maxCol];
		this.seatGroupId = seatGroupId;
		this.maxCol = maxCol;
		this.maxRow = maxRow;
	}
	
	
	public boolean isFirst() {
		return isFirst;
	}

	public void setIsFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}
	
	public boolean islast() {
		return islast;
	}

	public void setIslast(boolean islast) {
		this.islast = islast;
	}



	public Seat addSeat(int row, int col) {
		Seat seat = new Seat(row, col);
		//window seat
		if((isFirst && col == 0) ||  (islast && col == maxCol-1)) {
			seat.setSeatType(SeatType.WINDOW);
		}
		//Aisle seat
		else if(col == 0 || col == maxCol-1) {
			seat.setSeatType(SeatType.AISLE);
		}
		else {
			seat.setSeatType(SeatType.MIDDLE);
		}
		seat.setSeatGroupId(seatGroupId);
		seatGroup[row][col] = seat;
		return seat;
	}

	public Seat[][] getSeatGroup() {
		return seatGroup;
	}
	
}
