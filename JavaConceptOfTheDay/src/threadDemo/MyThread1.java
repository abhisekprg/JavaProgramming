package threadDemo;

public class MyThread1 extends Thread {
	int ticket;
	BookTicket b;
	MyThread1(BookTicket b,int ticket)
	{
		this.b=b;
		this.ticket=ticket;	
	}
	public void run()
	{
		b.book(ticket);
	}
}
