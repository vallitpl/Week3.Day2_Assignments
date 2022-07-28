package collectionsprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
public static void main(String[] args) {
	/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	int[] nums = {1,2,3,4,5,7,10,9,8,7};
	Set<Integer> numsSet = new TreeSet<Integer>();
	
	for(int i=0;i<nums.length;i++)
	{
		numsSet.add(nums[i]);
	}
	System.out.println(numsSet);
	
	List<Integer> numsList = new ArrayList<Integer>(numsSet);
	
	for(int i=0;i<numsList.size();i++)
	{
		//int temp = numsList.get(i);
		
		if(((numsList.get(i))+1) == numsList.get(i+1))
		{
			
		}
		else
		{
			System.out.println(numsList.get(i)+1);
		}
	}
		
	
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
}
}
