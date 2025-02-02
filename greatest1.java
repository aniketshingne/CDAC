import java.util.Scanner;
class greatest1{
public static void main(String args[]){
   int a , b ,c ,d;
  Scanner input = new Scanner(System.in);
  System.out.println("enter the 3 nos : ");
    a=input.nextInt(); 
    b=input.nextInt(); 
    c=input.nextInt(); 
    d=(a>b && b>c && a>c) ? a : ((b>a && b>c) ? b : c) ;
    System.out.println("the greatest no is : " +d);
 
   }
 }