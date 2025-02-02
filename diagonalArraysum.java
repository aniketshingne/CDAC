/*
5. Create an integer type 2-D array of size [3X3]. Take the elements from the
user and then calculate the sum of the elements present in the diagonal.
*/

import java.util.*;
class diagonalArraysum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemnts = ");
		int arr[][]=new int[2][2];
		int sum=0;
		for(int i=0 ; i<arr.length;i++){
			for( int j=0 ; j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();	
			}
		}
		System.out.println("***************************");	
		for (int ar[] : arr){
			for(int a : ar){
				System.out.print(a+ " ");
				}
				System.out.println(" ");
			}
	
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i==j){
				 sum += arr[i][j];
				}
			}
		}
		System.out.println("***************************");
		System.out.println(sum);

	}
}
