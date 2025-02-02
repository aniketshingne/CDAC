/* 5.	Create a class MathOperation that has four static methods.
     add() method that takes two integer numbers as parameter and returns the sum of the numbers. 
     subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
     multiply() method that takes two integer numbers as parameter and returns the product. 
     power() method that takes two integer numbers as parameter and returns the power of first number to second number.
    Create another class Demo (main class) that takes the two numbers from the user and 
    calls all four methods of MathOperation class by providing entered numbers 
    and prints the return values of every method. */

import java.util.Scanner;

	class MathOperation{
		int num1;
		int num2;
		
		static int add(int num1 , int num2){
			return num1+num2;
		}
		static int substract(int num1, int num2){
			return num1-num2;
		}
		static int multiply(int num1 , int num2){
			return num1*num2;
		}
		static int powers(int num1, int num2){
			return (int)Math.pow(num1, num2);
		}
	
}

class classDemo{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the two Number = ");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		System.out.println("Addition:= "+MathOperation.add(num1,num2));
		System.out.println("Substraction:= "+MathOperation.substract(num1,num2));
		System.out.println("Multiplication:= "+MathOperation.multiply(num1,num2));
		System.out.println("Power:= "+MathOperation.powers(num1,num2));
		
	}
}