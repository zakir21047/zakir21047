package Arrays;

import java.util.Scanner;

public class DuplicateEle {
	static void duplicateElement(int[] array) {
		for(int index=0;index<array.length;index++) {
			for(int index1=index+1;index1<array.length;index1++) {
				if(array[index]==array[index1]) {
					System.out.println(index1);
				}
				
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] array=new int[size];
	System.out.println("Enter the size of elements");
	for(int index=0;index<=array.length;index++) {
		array[index]=sc.nextInt();
	}
	duplicateElement(array);

	}

}
