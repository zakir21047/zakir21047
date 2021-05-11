package Arrays;

import java.util.Scanner;

public class sumOfStudent {
		static void listStudent(int student[][]) {
			for(int i=0;i<student.length;i++) {
				for(int j=0;j<student[i].length;j++) {
					System.out.print(student[i][j]+"");
				}
				System.out.println();
			}
		}
		static int[] arraySum(int student[][]) {
			int[] total=new int[student.length];
			for(int i=0;i<student.length;i++) {
				int num=0;
				for(int j=0;j<student[i].length;j++) { 
					num+=student[i][j];
					System.out.print(student[i][j]+"");
				}
				total[i]=num;
				System.out.println();
			}
			return total;
		}
		
		public static void main(String[] args) {
			
			int student[][] =new int[3][4];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter" + student.length+"Student marks");
			//int size=sc.nextInt();
			//int[] array=new int[size];
			
			for(int i=0;i<student.length;i++) {
				System.out.println((i+1 +"student"+student[i].length+"sub marks"));
				for(int j=0;j<student[i].length;j++) {
					student[i][j] = sc.nextInt();
					
				}
			}
			
			listStudent(student);
			for(int x:arraySum(student)) {
				System.out.println("Total marks="+x);
			}
	}

}
