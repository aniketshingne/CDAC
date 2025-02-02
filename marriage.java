import java.util.Scanner;
class marriage{
public static void main(String args[]){
  Scanner age = new Scanner(System.in);
  System.out.println("Enter the his age : ");
   int m= age.nextInt();
 System.out.println("Enter the hers age : ");
   int f= age.nextInt();
  if (m>18)
     {
     System.out.println(" he is eligible for marriage ");
     }
   else
      {
     System.out.println(" he is not  eligible for marriage ");
      }
   if (f>18){
    System.out.println("she is eligible for marriage");  
	}
     else{
     System.out.println(" she is not eligible for marriage ");
     }
   }
}  