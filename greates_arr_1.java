/* 1. Write a program to find the smallest and greatest number present in the array
of integer type.*/

import java.util.Scanner;
class greatest_arr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 no's : ");
		int ar[]= new int[10];
		int i ,j;
		int s=0,l=0	;

		for ( i=0;i<ar.length;i++){
			ar[i]=sc.nextInt();
		}

		for (i = 0; i< ar.length; i++){
			if ( i == 0){
				s = ar[i];
				l = ar[i];
			}
			else{
				if ( s > ar[i]){
					s = ar[i];
				}
			
				if ( l < ar[i]){
					l = ar[i];
				}
			}
			//System.out.println("Local Smallest number is "+s);
			//System.out.println("Local Largest number is "+l);
			//System.out.println("");
		}
		System.out.println("****************************");
		System.out.println("Global Smallest number is "+s);
		System.out.println("Global Largest number is "+l);
		System.out.println("****************************");
	}
}