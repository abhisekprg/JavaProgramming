package stringDemo;

public class LamdaDemo {
public static void main(String[] args) {
	
	/*
	 * interf i=a->a*a; System.out.println(i.square(5));
	 */

//annonymous class used
	
	interf i= new interf()
	{
		public int square(int x)
		{
			return x*x;
		}
	};
	System.out.println(i.square(5));
}
}
