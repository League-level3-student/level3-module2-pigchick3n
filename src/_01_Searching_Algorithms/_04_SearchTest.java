package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String [] array1 = new String[] {"hi","hii","hiii"};
	String [] array2 = new String[] {"ii","iii","iiii"};
	String [] array3 = new String[] {"ji","jii","jiii"};
	
	int[] array4 = new int[] {1,2,3};
	int[] array5 = new int[] {4,5,6};
	int[] array6 = new int[] {7,8,9};

	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.'
		assertEquals(1, _00_LinearSearch.linearSearch(array1, "hii"));
		assertEquals(0, _00_LinearSearch.linearSearch(array2, "ii"));
		assertEquals(2, _00_LinearSearch.linearSearch(array3, "jiii"));
		
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(2, _01_BinarySearch.binarySearch(array4,0,array1.length-1,3));
		assertEquals(1, _01_BinarySearch.binarySearch(array5,0,array1.length-1,5));
		assertEquals(0, _01_BinarySearch.binarySearch(array6,0,array1.length-1,7));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(array4,1));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(array5,6));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(array6,8));

	}
	
	@Test
	public void testExponentialSearch() {
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(array4,2));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(array5,4));
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(array6,9));
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
