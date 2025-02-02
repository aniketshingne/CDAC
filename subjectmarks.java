import java.util.Scanner;
class subjectmarks{
public static void main(String args[]){
Scanner marks = new Scanner(System.in);
System.out.println("enter the marks : " );
int s = 500;
float a = marks.nextFloat();
float b = marks.nextFloat();
float c = marks.nextFloat();
float d = marks.nextFloat();
float e = marks.nextFloat();
float f = ((a+b+c+d+e)/s)*100;
System.out.println("the percentage is : " +String.format("%.2f",f));

  }
}