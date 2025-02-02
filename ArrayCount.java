// 4. Write a program to print the total number of one-D arrays in a two-D array and
//the number of elements in every one-D array present in the two-D arrays.

import java.util.Scanner;
class ArrayCount{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row=0;
		int count=0;

		int arr[][]={
					{22,23,54,56},
					{32,61,2},
					{12}
				};

		for(int i=0 ; i<arr.length;i++){
			for(int j=0 ; j<arr.length;j++){
				count=j;	
			}
				row++;
				System.out.println("Elements in "+i+"th row is "+count );
		}
				System.out.println("Total number of rows in matix = "+row);
	}	
}