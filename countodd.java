//6. --&gt; to count odd numbers between 1 and 100

import java.util.*;

	class countodd{
		public static int countodd(int n1,int n2){
			int count=0;
			for(int i=n1;i<=n2;i++){
				if(i%2!=0) count++;
			}
			return count;
		}
		public static void main(String[] args){
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the the two numbers numbers ");
			int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			System.out.println("Count of odd numbers are " + countodd(n1,n2) );	
		}
	
	}
