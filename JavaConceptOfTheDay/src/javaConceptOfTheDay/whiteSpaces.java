package javaConceptOfTheDay;

public class whiteSpaces {

	public static void main(String[] args) {
		
		String s1="I	  am a string";
		String s2=s1.replaceAll("\\s","");
		System.out.println(s1);
		System.out.println(s2);
//s1.replaceAll("\\s+","") and s1.replaceAll("\\s","") produce the same result.
//The second regex is 20% faster than the first one, 
//but as the number consecutive spaces increases, the first one performs better than the second one.
			
		//System.out.println(s1);

	}

}
