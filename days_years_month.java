import java.util.Scanner;
class celicus{
public static void main(String args[]){
    Scanner f = new Scanner(System.in);
System.out.println("enter the fahrenhite temprature : " );
     double fh = f.nextDouble();
     double celcius=(fh-32)*5/9;
  System.out.println("temperature in celcius : " +(String.format("%.2f",celcius)));
  }
}