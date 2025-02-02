import java.util.Scanner;
class days_years_month{
public static void main(String args[]){
  Scanner d = new Scanner(System.in);
  double days = d.nextDouble();
  double weeks = 7,year,months;
  year = (days / 365) ;
  months=(days % 365)
System.out.println(year+ ":" +months )
  }
}