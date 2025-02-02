import java.util.Scanner;
class squaresum{
public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
 System.out.println("Enter the nth no : ");
     	 int n = sc.nextInt();
     	 int i ,sum=0;
 for (i=0 ; i<=n ;i++)
     {
       sum=sum+(i*i); 
     	  }
   System.out.println("Sum of Square "+sum);
     }
 }
    