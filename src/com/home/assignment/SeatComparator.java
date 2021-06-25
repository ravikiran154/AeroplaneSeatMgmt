package com.home.assignment;

import java.util.Comparator;

public class SeatComparator implements Comparator<Seat> {

	//seat type, seatgroup , row, col;
	@Override
	public int compare(Seat o1, Seat o2) {
		// priority comparision based on seat type
		if (o1.getSeatType().getPriority() != o2.getSeatType().getPriority()) {
			return o1.getSeatType().getPriority() - o2.getSeatType().getPriority();
		} else {

			if (o1.getRow() == o2.getRow()) {
				// left lane has more priority (when seat type, row are  same)
				if (o1.getSeatGroupId() != o2.getSeatGroupId()) {
					return o1.getSeatGroupId() - o2.getSeatGroupId();
				}
				// left most cell has more priority (when row, seatgroup and seat type as same)
				return o1.getCol() - o2.getCol();
			}
			//irrespective of seatgroup upper row has to be filled first
			return o1.getRow() - o2.getRow();

		}
	}

}
