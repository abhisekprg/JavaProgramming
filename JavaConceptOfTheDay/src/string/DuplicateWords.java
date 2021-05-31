package string;
import java.util.HashMap;
import java.util.TreeMap;
public class DuplicateWords {
	public static void duplicate(String s)
	{
		String words[]=(s.split(" "));
		HashMap<String,Integer> Hm=new HashMap<>();
		for (String word: words)
		{
			if(!Hm.containsKey(word.toUpperCase()))
				Hm.put(word.toUpperCase(),1);
			else
				Hm.put(word.toUpperCase(),Hm.get(word.toUpperCase())+1);
			}
	TreeMap t= new TreeMap(Hm);
	System.out.println(Hm);	
	System.out.println("Sorted Form");
	System.out.println(t);
	}

public static void main(String[] args) {
	String S1="Bread Butter bread butter bread jam fruit bread breed";
	duplicate(S1);
}
}
