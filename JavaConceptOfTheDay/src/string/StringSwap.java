package string;

public class StringSwap {
	public static void main(String[] args) {
		String s1="hello world";
		String s2="java users";
		System.out.println("before swap string1 "+s1+": string2 "+ s2);
		swap(s1,s2);
		}
	public static void swap(String cs1,String cs2)
	{
		 cs1=cs1+cs2;
		 cs2=cs1.substring(0, cs1.length()-cs2.length());
		 cs1=cs1.substring(cs2.length(),cs1.length());
	System.out.println("After swap string1 "+ cs1+": string2 "+cs2);
	}
}
