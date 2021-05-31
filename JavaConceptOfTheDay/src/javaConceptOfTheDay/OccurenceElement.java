package javaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceElement {

	public static void main(String[] args) {
		int arr[]={4, 5, 4, 5, 4, 6};
		/*
		 * for(int i=0;i<arr.length;i++) { int count=0; for(int j=0;j<arr.length;j++) {
		 * if(arr[i]==arr[j]) { count++; } } System.out.println(arr[i] +" terms exits "+
		 * count); }
		 */
		Map<Integer,Integer> map= new HashMap<> ();
		
		for(Integer I:arr)
		{
			if(map.containsKey(I))
				map.put(I,map.get(I)+1);
				else
				map.put(I,1);	
		}
		System.out.println(map);
	for(Entry<Integer, Integer> d :map.entrySet())
	{
		//System.out.println(d.getKey() +"-->" +d.getValue());
		System.out.println(d);
	}
	}
}