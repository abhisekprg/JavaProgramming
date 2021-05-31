package javaConceptOfTheDay;

public class Day {

	public static void main(String[] args) {
		String str1 = "Everyday is wonderfull day";
		String str2 = "day";
		int times=0;
		int count1 = 0, count2=1;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) != ' ') {
				count1++;
			}
			if(str1.charAt(i)==' ')
			{
				count2++;
			}
			if(str1.charAt(i)==str2.charAt(0))
			{
				times++;
			}
			
		}
		System.out.println("the number of characters " + count1);
		System.out.println("the number of words are "+ count2);
		System.out.println("the matching d are " +times +" times");
	}

}
