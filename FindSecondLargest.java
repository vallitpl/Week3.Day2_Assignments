package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7,2,3,3,6,7};

			/*
			 * Pseudo Code: 
			 * a) Create a empty Set Using TreeSet
			 * b) Declare for loop iterator from 0 to data.length and add into Set 
			 * c) converted Set into List
			 * d) Print the second last element from List 
			 * 
			 */
	Set<Integer> second = new TreeSet<Integer>();
	for(int i=0;i<data.length;i++)
	{
		second.add(data[i]);
	}
	System.out.println(second);
	List<Integer> secondList = new ArrayList<Integer>(second);
	int size = secondList.size();
	System.out.println(size);
	System.out.println(secondList.get(size-2));
}
}
