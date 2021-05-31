package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String S1="The Classroom";
		String S2="School Master";
		String CopyS1=S1.replaceAll("\\s","");
		String CopyS2=S2.replaceAll("\\s","");
		boolean flag= false;
		if (CopyS1.length()!=CopyS2.length())
		System.out.println("both are not anagram");
		else
		{
			char[] S3=S1.toLowerCase().toCharArray();
			char[] S4=S2.toLowerCase().toCharArray();
			Arrays.sort(S3);
			Arrays.sort(S4);
			flag=Arrays.equals(S3, S4);
		if(flag==true)
		System.out.println("The strings are anagram");
		else
		System.out.println("The strings are not an anagram");
	}
	}
}
