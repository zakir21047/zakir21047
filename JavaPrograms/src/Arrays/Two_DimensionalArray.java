package Arrays;

import java.util.Scanner;

public class Two_DimensionalArray {
	static void listStudent(int student[][]) {
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student[i].length;j++) {
				System.out.print(student[i][j]+"");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int student[][] =new int[3][4];
		//int size=sc.nextInt();
		//int[] array=new int[size];
		int k=0;
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student[i].length;j++) {
				student[i][j] = Integer.parseInt(args[k]);
				k++;
			}
		}
		
		listStudent(student);
	}

}
