import java.util.Scanner;
class primeno{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no : ");
    int n = sc.nextInt();
    int flag=0,i;
     
    if ( n==2){
	flag=0;
    }
   else{
	for ( i=2;i<n;i++){
		if(n%i==0){         // 5  4/3
			flag=1;
                  break;
            } 
      }
   }
   if (flag==0){
   	System.out.println(n+" is a prime no "); }
   else{
      System.out.println(n+" is not a prime no ");}
   }
}
    