import java.util.Scanner;
class reverse_no{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the no : ");
   int input = sc.nextInt();
   int remainder,reverse=0;
   while(input!=0)
   { 
     remainder= input%10;
     reverse= reverse*10+remainder;
     input=input/10;
     }
System.out.print("Enter the no : "+reverse);
 }
}