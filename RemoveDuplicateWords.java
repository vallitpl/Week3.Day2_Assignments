package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	
	//Split the String based on white spaces and save as String Array ,Then iterate the Array
	String[] strArray = text.split(" ");
	for(int i=0;i<strArray.length;i++)
	{
		System.out.println(strArray[i]);
	}
	
	//create an empty set
	Set<String> unique =new HashSet<String>();
	
	//Iterate the String array and add each word into Set
	for(int i=0;i<strArray.length;i++)
	{
		unique.add(strArray[i]);
	}
	//Print the Set values which is having unique words
	System.out.println(unique);
}
}
