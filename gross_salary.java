import java.util.Scanner;
class gross_salary{
public static void main(String args[]){
  Scanner basic = new Scanner(System.in);
  System.out.println("Enter the basic salary : ");
  int b = basic.nextInt();
  int hra,da,gs; 
 if(b<10000)
      {
        hra=(b/100)*10;
        da =(b/100)*90;
        gs=(b+hra+da);
 System.out.println("the gross salary : " +gs);
      }
   else if(b>=10000)
      {
        hra=2000;
        da =(b/100)*98;
        gs=(b+hra+da);
  System.out.println("the gross salary : " +gs);
      }     
   }
 }