// 3. Initialize one String type of array and print the elements using for each loop.

import java.util.Scanner;
class StringArrayLoop{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter element");
			arr[i] = sc.nextInt();
		}
		System.out.println("***************************");
		for (int numb : arr){
			 System.out.println(numb);
    			}
	}
}