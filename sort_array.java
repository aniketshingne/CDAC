/*7.Sort a ten element array in descending order.*/

import java.util.Scanner;
class sort_array{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 no's = ");
 		int arr[]= new int[10];
     		int i,j,a;
		for ( i=0;i<arr.length;i++ )
		  {
			arr[i]=sc.nextInt();
		  }
		for (i=0;i<arr.length;i++)
			{
                     for (j=i+1;j<arr.length;j++)
			      {	
                           if (arr[i] < arr[j])
                             {
                                 a=arr[i];
                                 arr[i]=arr[j];
                                 arr[j]=a;
                              }
			        }
		       }
              System.out.println("================================ ");
              for (i=0;i<arr.length;i++)
                  System.out.println(arr[i]+" ");
         }
   }