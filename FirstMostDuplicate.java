package collectionsprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstMostDuplicate {
public static void main(String[] args) {
	 String input = "abbabba";
	 
	 char[] ch1 = input.toCharArray();
	 
	 Map <Character,Integer> map = new LinkedHashMap<Character,Integer>();
	 for(int i=0;i<ch1.length;i++)
		{
			char key = ch1[i];
			map.put(key, map.getOrDefault(ch1[i], 0)+1);
		}
		System.out.println(map);
	int maxOccurance = 0;
	char maxOccChar = ' ';
	for(Entry<Character,Integer> entry: map.entrySet())
	{
		if(entry.getValue()>maxOccurance)
		{
			maxOccurance = entry.getValue();
			maxOccChar = entry.getKey();
		}
		
	}
	System.out.println("Max Occurring is: "+ maxOccChar +" and the number of Occurance is: "+maxOccurance);
	
	
	/*
	 * Psuedocode
	 * 
	 * 1) Map -> HashMap 
	 * 2) String -> ch[] -> Get all the character -> occurance
	 * 3) Keep comparing the occurance with other values -> max value -> character
	 * 
	 */
	
}
}
