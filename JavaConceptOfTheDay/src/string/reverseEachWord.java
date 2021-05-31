package string;

public class reverseEachWord {
	public static void main(String[] args) {
String orginalString="I am not a string";
String[] originalWord=orginalString.split(" ");
String reverseString="";
for(int i=0;i<originalWord.length;i++)
{
	String word=originalWord[i];
	String reverseWord="";
	for(int j=word.length()-1;j>=0;j--)
	{
	reverseWord=reverseWord+word.charAt(j);
	}
reverseString=reverseString+reverseWord+" ";
}
System.out.println(reverseString);
}

}
