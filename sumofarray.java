// 2. Create an array of 10 elements in 5 rows. And calculate sum of all elements..

import java.util.Scanner;
class StringArrayLoop{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[][] = new int[2][5];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter element");
				arr[i][j] = sc.nextInt();
			}
		}
			System.out.println();
			for(int ar[] : arr){
				for(int a : ar){
					System.out.print(a+" ");
				}
				System.out.println("");
			}
			System.out.println();
				for(int k=0;k<arr.length;k++){
				for(int l=0;l<arr[k].length;l++){
					sum += arr[k][l]; 
				}
			}
			System.out.println(sum);

	}
}