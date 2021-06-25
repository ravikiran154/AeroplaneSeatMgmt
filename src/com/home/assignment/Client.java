package com.home.assignment;


public class Client {
	
	
	public static void main(String[] args) {
		
		int config[][] = {{3,2},{4,3},{2,3},{3,4}};
		
		AeroplaneSeatManager seatManager = new AeroplaneSeatManager(new SeatPriorityEvaluator());
		AeropaneSeatingModule seatingModule = new AeropaneSeatingModule(config, seatManager);
		
		//booking service
		for(int i=1;i<=30;i++) {
			seatingModule.getSeatManager().book(i);
		}
		
		
		SeatingLayout seatingLayout = seatingModule.getSeatManager().getSeatingLayout();
		
		//print service
		IPrintService consolePrinter = new ConsolePrintService();
		consolePrinter.print(seatingLayout);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

}
