/*5.Print all prime numbers between two given numbers. [ break
continue ]*/

import java.util.Scanner;
class allprimeno{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
   System.out.println("Enter the 1st no = ");
   	 	int num1 = sc.nextInt();
   System.out.println("Enter the nth no = ");
  		int num2 = sc.nextInt();
  	int i ,j, flag=0;

  if (num1>=0 && num2>=0 )
   {    
  		for (i=num1;i<=num2;i++)
             {
         		  if (i==1 || i==0)
            	  continue;
        		  flag=0;
		  	     for(j=2;j<i;j++)
                        {
                 	         if(i%j==0)
					{
                 		       flag=1;
                  	       break; 
                              }  
                 	      }
             if (flag==0)
                System.out.println(" prime no is : "+i);
             }
        }
      else
      System.out.println("Enter the +ve number ");     
    }
}