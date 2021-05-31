package threadDemo;

public class test {

	public static void main(String[] args) {
		MultipleThread1 t1= new MultipleThread1();
		t1.start();
		MultipleThread2 t2= new MultipleThread2();
		t2.start();
		t2.start();
	}

}
