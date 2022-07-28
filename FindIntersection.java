package collectionsprogram;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
public static void main(String[] args) {
	int[] a = {3,2,11,4,6,7};
	int[] b={1,2,8,4,9,7};
	
	//create a two empty Lists - list1 & list2
	List<Integer> a1 = new ArrayList<Integer>();
	List<Integer> b1 = new ArrayList<Integer>();
	
	//Declare for loop iterator from 0 to array a.length and add into list1
	//Declare for loop iterator from 0 to array b.length and add into another list2
	for(int i=0; i<a.length; i++)
	{
		a1.add(a[i]);
	}
	System.out.println(a1);
	for(int i=0; i<b.length; i++)
	{
		b1.add(b[i]);
	}
	System.out.println(b1);
	
	//Compare Both list1 & list2 using a nested for loop Print the matching number
	for(int i=0;i<a1.size();i++)
	{
		for(int j=0;j<b1.size();j++)
		{
			if(a1.get(i) == b1.get(j))
			{
				System.out.println(a1.get(i));
			}
		}
	}
}
}
