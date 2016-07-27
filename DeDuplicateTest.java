package com.ntt.data.util;

import java.util.Arrays;

import junit.framework.TestCase;

public class DeDuplicateTest extends TestCase {
	
	DeDuplicate dedup;
	//int[] arr = {1, 10, 200, 7, 1, 9, 201, 5, 20, 1, 200, 10};
	//int[] dearr = {1, 5, 7, 9, 10, 20, 200, 201}; 
	
	int[] arr;
	int[] dearr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 34, 43, 45, 85, 86, 10000};
	
	protected void setUp(){
		dedup = new DeDuplicate();
		arr = dedup.randomIntegers;
   }

	public void testRemoveDup() {
		int[] newarr = dedup.removeDup(arr);
		assertTrue(Arrays.equals(newarr, dearr));
	}

	public void testRemoveDupSet() {
		int[] newarr = dedup.removeDupSet(arr);
		Arrays.sort(newarr);
		assertTrue(Arrays.equals(newarr, dearr));
	}

	public void testRemoveDupLinkedSet() {
		int[] newarr = dedup.removeDupLinkedSet(arr);
		Arrays.sort(newarr);
		assertTrue(Arrays.equals(newarr, dearr));
	}

}
