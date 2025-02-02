import java.util.Scanner;
class greatest_arr{
public static void main(String args[]){
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the 10 no's : ");
  	int ar[]= new int[10];
	int i ,j;
	for ( i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	for (i=0;i<ar.length;i++)
	   {
		for (j=i+1;j<ar.length;j++)
              {
			if (ar[i]>ar[j])
		         {
				ar[i]=ar[j];
		         }
                }
	    }
        System.out.println("greatest no's : "+i);
    }
}
                    