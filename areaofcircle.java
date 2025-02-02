import java.util.Scanner;
class areaofcircle{
public static void main(String args[]){
Scanner radius = new Scanner(System.in);
System.out.println("enter the radius of circle : " );
float r = radius.nextFloat();
float pi=3.14f ;
float a=pi*r*r;
float b=2*(pi*r);

System.out.println("the area of circle: " +String.format("%.2f",a));
System.out.println("the circumfernce of circle: "+String.format("%.2f",b));
  }
}