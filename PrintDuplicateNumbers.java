package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {
public static void main(String[] args) {
	int[] data = {4,3,6,8,29,1,2,4,7,8};
	
	Set<Integer> unique = new HashSet<Integer>();
	
	for(int i =0; i<data.length;i++)
	{
		boolean add = unique.add(data[i]);
		if(!add)
		{
			System.out.println(data[i]);
		}
	}

	/*
	 * Problem Statement : Print only duplicate values
	 * Expected output: 4 and 8
	 * 
	 * How to solve?
	 * 1) Regular for loop
	 * 2) Using Set
	 * 
	 * Using Set 
	 * 
	 * a) Add every element into Set
	 * b) If it is already there in the Set -> Print duplicate
	 * 
	 */
	
}
}
