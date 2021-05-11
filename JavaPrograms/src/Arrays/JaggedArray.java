package Arrays;

import java.util.Scanner;

public class JaggedArray {
	static void jaggedArray(int cse[][]) {
		for(int j = 0; j < cse.length; j++) {
			for(int k = 0;k < cse[j].length; k++) {
				System.out.println(cse[j][k]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] cse=new int[3][];
		 cse[0]=new int[4];
		 cse[1]=new int[2];
		 cse[2]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+cse.length+"Student info");
		for(int j = 0; j < cse.length; j++) {
			System.out.println("Enter student"+(j+1)+"marks");
			for(int k = 0;k < cse[j].length; k++) {
				cse[j][k] = sc.nextInt();
			}
		}
		jaggedArray(cse);
	}

}
