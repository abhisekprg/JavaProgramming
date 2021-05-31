package string;
import java.util.LinkedHashMap;
public class LongestSubstringDemo { 
	    	
public static void longestSubstring(String s)
{
	String maxSubstring="";
	int length=0;
	char [] ch=s.toCharArray();
	LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
	for(int i=0;i<ch.length;i++)
	{
		if(!map.containsKey(ch[i]))
		{
			map.put(ch[i], i);
		}else
		{
			i=map.get(ch[i]);
			map.clear();
		}
		if(map.size()>length)
		{
			length=map.size();
			maxSubstring=map.keySet().toString();
		}
	}
	System.out.println("the input string "+s);
	System.out.println("substring "+ maxSubstring);
	System.out.println("length of the string "+length);
}    
	    public static void main(String[] args) 
	    {   
	        longestSubstring("javaconceptoftheday");
	         
			/*
			 * System.out.println("==========================");
			 * 
			 * longestSubstring("thelongestsubstring");
			 */
	    }   
	}

