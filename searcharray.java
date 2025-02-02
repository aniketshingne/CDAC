// 9.Write a program to search an element in the array.

import java.util.Scanner;
class searcharray{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
      System.out.println("Enter the lenght of array ");
      	int size = sc.nextInt();
      	int arr[]=new int[size];
      System.out.println("Enter array elements :  ");
      	int i,x,count=0;
       	for(i=0;i<arr.length;i++)
			{
        	   		arr[i]=sc.nextInt();
			}
       
	 System.out.println("value to search :  ");
		  x = sc.nextInt();
		for(i=0;i<arr.length;i++)
			{
             	   if(arr[i]==x)
				{
  				  count=1;
				  break;
				}
			 }
		if(count==1)
		   {
			 System.out.println(x+ " Element found at index "+i);
		  }
		 else
		   {
			System.out.println("Element not found");
		 }
        }
  }
			
              	   