//UIUC CS125 SPRING 2016 MP. File: SelectionSort.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2016-04-18T08:00:20-0500.644631539
/**
 * 
 * @author ywang443
 *
 */
public class SelectionSort {
	/**
	 * Sorts the entire array using selection sort
	 * This is just a wrapper method that calls the 
	 * recursive method with the correct parameter lo,hi values.
	 * @param data
	 */
	public static void sort(double[] data) {
		sort(data,0,data.length-1);
	}

	/** Recursively sorts the sub array lo...hi using selection sort algorithm.*/
	public static void sort(double[] data, int lo, int hi) {
		if(lo == hi) 
			return;
		int min = findMin(data,lo,hi);
		swap(data, lo, min);
		sort(data, lo+1, hi);
	}

	/** Helper method for selection sort: Swaps values at indices i and j*/
	public static void swap(double[] data, int i, int j) {
		double temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	/**
	 * Recursively finds the position of the smallest value of the values lo...hi (inclusive). 
	 * @param data
	 * @param lo
	 * @param hi
	 * @return
	 */
	public static int findMin(double[] data, int lo, int hi) {
		if(lo == hi) 
			return lo;
		if(data[lo] > data[hi]) 
			return findMin(data, lo+1, hi);
		return findMin(data, lo, hi-1);

	}

}
