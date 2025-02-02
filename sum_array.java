/*6.Program to show sum and average of 10 element array. Accept
array elements from user.*/

import java.util.Scanner;
class sum_array{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 no's = ");
 		int arr[]= new int[10];
     		int i,sum=0;
		for ( i=0;i<10;i++ )
		  {
			arr[i]=sc.nextInt();
		  }
		for (int a : arr)
			{
                     sum= sum+a;
			}
		System.out.println("the sum of the aray = "+sum);
            double avg=sum/10;
            System.out.println("the avg of the array = "+avg);
          }
   }