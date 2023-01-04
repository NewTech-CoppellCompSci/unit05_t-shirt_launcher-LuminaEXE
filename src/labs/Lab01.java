package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner sc = new Scanner(System.in);
		int num1 = intIn(sc,"Enter #1");
		int num2 = intIn(sc,"Enter #2");
		
		System.out.println(num1+"^"+num2 + " = " + Math.pow(num1, num2));
		
	}
	
	
	
	public static void problem2() {
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		int number = intIn(sc, "Enter a positive integer");
		System.out.println("The square root of "+number+" is "+Math.sqrt(number));
			
	}
	
	
	
	public static void problem3() {
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		int a = intIn(sc,"Enter a positive integer");
		int b = intIn(sc,"Enter a positive integer");
		
		System.out.println(
			"Hypotenuse = "+
			Math.sqrt(
					Math.pow(a,2)+Math.pow(b,2)
			)
		);
	}
	
	
	public static void problem4() {
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		do {
			int num = intIn(sc,"Enter a number: ");
			
			if(num == 0) {
				flag = true;
			}
		}while(flag);
	}
	
	public static int intIn(Scanner sc, String user) {
		System.out.print(user+": ");
		return sc.nextInt();
	}

	
}
