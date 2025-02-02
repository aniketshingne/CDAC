// 8.Write a program to reverse the array elements.

import java.util.Scanner;
class arrayreverse{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the 10 no  : ");
int arr[] =new int[10];
for (int i=0 ;i<arr.length;i++){
  arr[i]=sc.nextInt();
    }
 for(int i=arr.length-1; i>=0 ; i--){
     System.out.print(arr[i]+ "  ");
      }
  }
}
