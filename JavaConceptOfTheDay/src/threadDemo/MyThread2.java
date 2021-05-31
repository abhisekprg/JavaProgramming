package threadDemo;

public class MyThread2 extends Thread{
	int ticket;
	BookTicket b;
	MyThread2(BookTicket b,int ticket)
	{
		this.b=b;
		this.ticket=ticket;
	}
	public void run()
	{
		b.book(ticket);
	}
}
