package com.home.assignment;

import java.util.List;

public class ConsolePrintService implements IPrintService {

	@Override
	public void print(SeatingLayout seatingLayout) {
		List<SeatGroup>seatGroups =  seatingLayout.getSeatGroups();
		StringBuilder osb = new StringBuilder();
		for(int i =0;i<seatGroups.size();i++) {
			Seat seats [][] = seatGroups.get(i).getSeatGroup();
			String sg = getSeatGroup(seats);
			osb.append("SEATGROUP : " + i)
			.append("\n")
			.append(sg)
			.append("\n");
		}
		System.out.println(osb.toString());
	}
	
	private static String getSeatGroup(Seat[][] seats) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<seats.length;i++) {
			for(int j=0;j<seats[0].length;j++) {
				sb.append(seats[i][j].getSeatID())
				.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
