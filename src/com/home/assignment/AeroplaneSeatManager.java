package com.home.assignment;

public class AeroplaneSeatManager {
	
	private SeatingLayout seatingLayout;
	
	private SeatPriorityEvaluator seatPriorityEvaluator;
	
	public AeroplaneSeatManager(SeatPriorityEvaluator seatPriorityEvaluator) {
		this.seatPriorityEvaluator = seatPriorityEvaluator;
	}

	public void init(int[][] config) {
		SeatingLayout layout  = new SeatingLayout();
		for(int i=0;i<config.length;i++) {
			int cols = config[i][0];
			int rows = config[i][1];
			SeatGroup seatGroup = new SeatGroup(rows, cols, i);
			if(i == 0) {
				seatGroup.setIsFirst(true);
			}
			else if(i == config.length-1) {
				seatGroup.setIslast(true);
			}
			for(int j=0;j<rows;j++) {
				for(int k=0;k<cols;k++) {
					seatPriorityEvaluator.add(seatGroup.addSeat(j, k));
				}
			}
			
			layout.getSeatGroups().add(seatGroup);
		}
		this.seatingLayout = layout;
	}
	
	//release seat
	public void release(Seat seat) {
		Seat seats [][] = seatingLayout.getSeatGroups().get(seat.getSeatGroupId()).getSeatGroup();
		seat.setSeatID(0);
		seats[seat.getRow()][seat.getCol()] = seat;
		seatPriorityEvaluator.add(seat);
	}
	
	//book seat
	public void book(int seatId) {
		Seat seat = seatPriorityEvaluator.get();
		seat.setSeatID(seatId);
		Seat seats [][] = seatingLayout.getSeatGroups().get(seat.getSeatGroupId()).getSeatGroup();
		seats[seat.getRow()][seat.getCol()] = seat;
	}

	public SeatingLayout getSeatingLayout() {
		return seatingLayout;
	}

}
