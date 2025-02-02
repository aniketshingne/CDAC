/* 4. Create a class Circle that has two data members, one to store the radius and
another to store area and three methods first init() method to input radius from
user, second calculateArea() method to calculate area of circle and third
display() method to display values of radius and area. Create class
CircleDemo ( main class) that creates the Circle object and calls init(),
calculateArea() and display() methods. */

import java.util.Scanner;

class circle{
	float radius;
	float area;
	
	void init(float radius){
		this.radius=radius;
	}

	void calculateArea(){
		this.area=area;
		area=(float)3.14*radius*radius;
	}
	void display(){
		System.out.println("Radius of circle "+radius);
		System.out.println("Area of circle "+area);
	}
}

class CircleDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius = ");
		float radius = sc.nextFloat();
		circle c = new circle();
		c.init(radius);
		c.calculateArea();
		c.display();
		
	}
}