//Reads in strings and prints them in sorted order using insertion sort.

package com.algorithm;

/**
 * 
 * @author Raja
 *
 * @param <T> Type casting
 */

public class InsertionSort<T> {

	public static void main(String[] args) {

		String[] arr = { "Raja", "Raj", "Suraj", "Pankaj", "Ram", "Biswas", "Chinna", "Raju" };
		System.out.println();
		System.out.println("Before Insertion Sort");
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();

		// sorting array using insertion sort
		insertionSort(arr);

		// Printing the array
		System.out.println("After Insertion Sort");
		for (String s : arr) {
			System.out.print(s + " ");
		}
	}

	// Method for insertion sort.
	public static <T extends Comparable> void insertionSort(T[] arr) {
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			T key = arr[i];
			int j = i - 1;
			while ((j > -1) && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}