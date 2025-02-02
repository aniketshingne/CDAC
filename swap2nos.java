import java.util.Scanner;
class swap2nos{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
  System.out.println("Enter the a no : ");
      int a = input.nextInt();
  System.out.println("Enter the b no : ");
      int b = input.nextInt();
int c;
         c=a;
         a=b; 
         b=c;
  System.out.println("a : " +a+ " b : " +b);
  }
}