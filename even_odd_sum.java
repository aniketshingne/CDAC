/* 10.Write the program to find the sum of even elements and sum of
odd elements present in the array of integer type.*/

import java.util.Scanner;
class evenoddsum{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
      System.out.println("Enter the lenght of array ");
      	int size = sc.nextInt();
      	int arr[]=new int[size];
      System.out.println("Enter array elements :  ");
      	int i,sumeven=0,sumodd=0;
       	for(i=0;i<arr.length;i++)
		 {
        	   	arr[i]=sc.nextInt();
		   }
           for (int x : arr)
			{
                    if(x%2==0)
                      { 
                         sumeven=sumeven+x;
                       } 
                     else
                       {
                          sumodd=sumodd+x;
                       }   
          
    			}
          System.out.println("Sum of even no = :  " +sumeven);
  	     System.out.println("Sum of odd no = :  " +sumodd);
        }
  }
			
              	   