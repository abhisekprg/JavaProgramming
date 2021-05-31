package threadDemo;

public class BookTicket {
	static int totalTicket=20;
 synchronized static public void book(int ticket)
 {
	 if(ticket<=totalTicket)
	 {
		System.out.println(ticket +" tickets book successfully"); 
	 totalTicket=totalTicket-ticket;
	 System.out.println("seats left "+ totalTicket);
	 }else
	 {
		 System.out.println(ticket+" not booked as tickets left "+ totalTicket);
	 }
 }
}
