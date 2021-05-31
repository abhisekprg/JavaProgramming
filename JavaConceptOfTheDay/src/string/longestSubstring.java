package string;

import java.util.LinkedHashMap;

public class longestSubstring {
public static void main(String[] args) {
	String s1="javaconceptoftheday";
	withoutRepeating(s1);
}

private static void withoutRepeating(String s)
{
	LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
//  if HashMap <character,integer> map= new hashMap<>() is used then insertion order not preserved result will be [o,t,h,f,...] random
	char []c= s.toCharArray();
	int length=0;
	String longestSubString="";
	for(int i=0; i<c.length;i++)
	{
		char ch=c[i];
		if(!map.containsKey(ch))
		{
			map.put(ch, i);
		}else
		{
			i=map.get(ch);
			map.clear();
		}
		if(map.size()>length)
		{
		length=map.size();
		longestSubString=map.keySet().toString();		
		}
	}
System.out.print("longest Substring :"+longestSubString);
}
}
