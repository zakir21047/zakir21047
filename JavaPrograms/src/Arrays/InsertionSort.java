package Arrays;

import java.util.Scanner;

public class InsertionSort {
	static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i;
			while ((j  >0) && (array[j-1]) > key) {
				array[j ] = array[j-1];
				j=j-1;
			}
			array[j ] = key;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int index = 0; index <= array.length - 1; index++) {
			array[index] = sc.nextInt();
		}

		insertionSort(array);

		for (int result : array) {
			System.out.println(result);
		}
	}
}
