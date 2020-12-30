package BusBookingApp;


public class TicketThread extends Thread{
	
	private TicketCounter ticketCounter;
	
	private String name;
	
	private int bookedSeats;
	
	
	public TicketThread(TicketCounter ticketCounter2, String name, int bookedSeats) {
		this.ticketCounter = ticketCounter2;
		this.name = name;
		this.bookedSeats = bookedSeats;
	}


	public void run() {
		ticketCounter.checkTicketavailablity(name, bookedSeats);
	}

}
