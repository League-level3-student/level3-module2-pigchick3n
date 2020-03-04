package _01_Searching_Algorithms;

public class _00_LinearSearch {
	// When finding the location of a certain element in an array, 
	// there are many algorithms that can do so. The simplest is the
	// linear search. This is best for short unsorted lists of data.
	public static int linearSearch(String[] words, String value) {
	
		for (int i = 0; i < words.length; i++) {
			if (value .equals (words[i])) {
				return i;
			}
		}
		
		//1. Complete the method using a for loop to find the value
		//   in the array. Return the location in the array
		//   where the value was found.
		//   If the value is not found in the array, return -1.
		
		return -1;
	}
}
