package com.home.assignment;

import java.util.ArrayList;
import java.util.List;

public class SeatingLayout {
	
	private List<SeatGroup>seatGroups;
	

	public List<SeatGroup> getSeatGroups() {
		if(seatGroups == null) {
			seatGroups = new ArrayList<>();
		}
		return seatGroups;
	}
	
}
