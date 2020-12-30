package BusBookingApp;

public class TicketCounter {
	
	private int remainingTickets=3;
	
	public synchronized void checkTicketavailablity(String name,int bookedSeats) {
		if(bookedSeats==0) {
			System.out.println(name+" please select atleast 1 seat ");
			return;
		}
		if(bookedSeats<=remainingTickets && bookedSeats>0) {
			remainingTickets=remainingTickets-bookedSeats;
			System.out.println(name+" successfully your seats are booked");
		}
		else{
			System.out.println(name+ " No Seats are available");
		}
	}

}
