package threadDemo;

public class BookingAap {
	public static void main(String[] args) {
		BookTicket b1= new BookTicket();
		MyThread1 t1= new MyThread1(b1,7);
		MyThread2 t2= new MyThread2(b1,8);
		t1.start();
		t2.start();
		
		BookTicket b2=new BookTicket();
		MyThread1 t3= new MyThread1(b2,9);
		MyThread2 t4= new MyThread2(b2,1);
		t3.start();
		t4.start();
			
				}
	}
