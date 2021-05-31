package javaConceptOfTheDay;

public class OverloadedMethod {
	public static void main(String[] args) {
		OverloadedMethod object = new OverloadedMethod();
		object.print(null);
	}

	
	  public void print(Object obj) { System.out.println("object"); }
	 

	public void print(StringBuilder obj) { // line -12 StringBuilder ob=new
		System.out.println("StringBuilder");
	}

	/*
	 * public void print(String obj) { // line- 15 System.out.println("String"); }
	 */
}
