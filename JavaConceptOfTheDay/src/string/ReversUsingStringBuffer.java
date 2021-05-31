package string;

public class ReversUsingStringBuffer {

	public static void main(String[] args) {
	
		String s1="Madam";
		StringBuffer sb= new StringBuffer(s1);
		String s3= new String(sb.reverse());
		System.out.println("original String "+s1);
		System.out.println("reverse String "+s3);
		if(s3.toLowerCase().equals(s1.toLowerCase()))
			System.out.println("equals");
		else
			System.out.println("Not equals");
	}
}
