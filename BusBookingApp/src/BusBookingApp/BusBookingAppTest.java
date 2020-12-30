package BusBookingApp;

public class BusBookingAppTest {

	public static void main(String[] args) {
		TicketCounter ticketCounter=new TicketCounter();

		TicketThread t1=new TicketThread(ticketCounter,"test1",2);
		TicketThread t2=new TicketThread(ticketCounter,"test2",2);
		t1.start();
		t2.start();
	}

}
