package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}

	public static void problem1() {		
		Scanner sc = new Scanner(System.in);
		int max = intIn(sc,"Enter the max");
		int min = intIn(sc,"Enter the min");
		
		for(int i = 0; i < 100; i++) {
			int random = randomNumber(min, max);	
			System.out.print(random+" ");
		}
	}


	public static void problem2() {
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		
		int radius = intIn(sc,"Enter the radius");
		int height = intIn(sc,"Enter the height");
		double pie=3.14285714286;  
		
		double volume = pie*Math.pow(radius, 2)*height; 
		System.out.println("Volume of the cylinder = "+volume);  
	}


	public static void problem3() {
		
		
	}

	
	
	public static void problem4() {
		
		
	}

	public static int randomNumber(int min, int max) { 
		
		int b = (int)(Math.random()*(max-min+1)+min);  
		return b;  
	}
	public static int intIn(Scanner sc, String user) {
		System.out.print(user+": ");
		return sc.nextInt();
	}
}
