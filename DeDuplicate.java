package com.ntt.data.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Removing duplicate element from the int array
 * @author ssomu
 *
 */
public class DeDuplicate {

	Logger logger = Logger.getLogger(DeDuplicate.class.getName());
	
	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
									20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
									13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	
	public static void main(String [] args) {
				
	}
	
	/**
	 * Removing the duplicate value from the integer array
	 * @param arr
	 * @return integer array
	 */
	public int[] removeDup(int[] arr) {
		logger.log(Level.INFO, "DeDuplicate.removeDup:" + Arrays.toString(arr));
		if ( null != arr && 0 < arr.length ) {
			int len = arr.length;
			int[] newarr = new int[len];
			Arrays.sort(arr); //quick sort
			int i = 0;
			int latest = arr[0];
			newarr[i++] = latest;
			for (int el: arr) {
				if ( el != latest ) {
					newarr[i++] = el;
					latest = el;
				}
			}
			if ( i < len ) {
				newarr = Arrays.copyOf(newarr, i);
			}
			logger.log(Level.INFO, "DeDuplicate.removeDup:" + Arrays.toString(newarr));
			return newarr;
		}
		return null;
	}
	
	/**
	 * Removing the duplicate value from the integer array using HashSet
	 * @param arr
	 * @return integer array
	 */
	public int[] removeDupSet(int[] arr) {
		logger.log(Level.INFO, "DeDuplicate.removeDupSet:" + Arrays.toString(arr));
		if ( null != arr ) {
			int len = arr.length;
			Set<Integer> hashSet = new HashSet<Integer>(len);
			for (int i: arr) {
				hashSet.add(i);
			}
			int[] newarr = convertPrimitive(hashSet);
			logger.log(Level.INFO, "DeDuplicate.removeDupSet:" + Arrays.toString(newarr));
			return newarr;
		}
		return null;
	}
	
	/**
	 * Removing the duplicate value from the integer array using LinkedHashSet to maintain the original order
	 * @param arr
	 * @return integer array
	 */
	public int[] removeDupLinkedSet(int[] arr) {
		logger.log(Level.INFO, "DeDuplicate.removeDupLinkedSet:" + Arrays.toString(arr));
		if ( null != arr ) {
			int len = arr.length;
			Set<Integer> hashSet = new LinkedHashSet<Integer>(len);
			for (int i: arr) {
				hashSet.add(i);
			}
			int[] newarr = convertPrimitive(hashSet);
			logger.log(Level.INFO, "DeDuplicate.removeDupLinkedSet:" + Arrays.toString(newarr));
			return newarr;
		}
		return null;
	}
	
		
	private int[] convertPrimitive(Collection<Integer> col) {
		logger.info("convertPrimitive:col-"+col);
		int[] ret = new int[col.size()];
		int i = 0;
		for(Integer el: col) {
			ret[i++] = el;
		}
		return ret;
	}
	
	public static void sop(String str) {
		System.out.println(str);
	}
}
