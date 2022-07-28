package collectionsprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNumberOfOccurances {
public static void main(String[] args) {
	
	int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};
	//output: 2 -> 3 , 3 -> 2, 4 -> 1 
	 
	Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
	//First Method
	/*for(int i=0;i<nums.length;i++)
	{
		if(map.containsKey(nums[i]))
		{
			map.put(nums[i],map.get(nums[i])+1);
		}
		else
		{
			map.put(nums[i], 1);
		}
	}
	System.out.println(map);*/
	
	//Simpler Version in Java8
	for(int i=0;i<nums.length;i++)
	{
		int key = nums[i];
		map.put(key, map.getOrDefault(nums[i], 0)+1);
	}
	System.out.println(map);
	/*
	 * Psuedcode:
	 * 
	 * 1) Create Map -> TreeMap
	 * 2) For loop -> each number -> add to the map
	 * 3) If it is exist -> update it with + 1
	 * 	  Else -> new entry with 1 as value
	 * 
	 */
}
}
