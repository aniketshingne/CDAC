import java.util.Scanner;
class greatest2{
public static void main(String args[]){
   int a , b ,c ,d;
  Scanner input = new Scanner(System.in);
  System.out.println("enter the 3 nos : ");
    a=input.nextInt(); 
    b=input.nextInt(); 
    c=input.nextInt(); 
    if (a>b && a>c )
         System.out.println("The greatest no is : " +a);
     else if (b>a && b>c )
         System.out.println("The greatest no is : " +b);
      else
         System.out.println("The greatest no is : " +c);
     }
 }