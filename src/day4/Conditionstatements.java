package day4;

import java.util.Scanner;

public class Conditionstatements {
	public static void comparetoString(String s1, String s2) {
		int value = s1.compareTo(s2);
		if (value ==0) {
			System.out.println("TC passed");
		} else System.out.println("TC failed");
	}
	public static void age() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:" );
		int age= sc.nextInt();
		if (age>=18) {
			System.out.println("You are eligible to vote." );
		} else System.out.println("You are not eligible to vote." );
	}
	public static void evenNumber(int n) {
		if (n%2==0) {
			System.out.println("number is an even number" );
		} System.out.println("number is not even number" );
	}
	public static void studentGrade(float a, float b, float c) {
		float ave= (a+b+c)/3;
		if (ave >=90) {
			System.out.println("Your grade is A." );
		} else if (ave>=70 && ave<90) {
			System.out.println("Your grade is B." );
		} else System.out.println("Your grade is C." );
	} 
	public static void revenue(int q) {
		int price= 25;
		float rev=0;
		float dis=0;
		if (q>=100 && q<=120) {
			 dis=(float) (price*q*0.1);
			 rev=  price*q - dis;
		} else if (q>120) {
			 dis=(float) (price*q*0.15);
			 rev=  price*q - dis;
		} else {
			 rev=  price*q;
		}
		System.out.println("The revenue from sale: " +rev);
		System.out.println("After discount: " +dis);
	}	
	public static void number() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: " );
		String a= sc.nextLine();
		if(a.length()>1) {
		System.out.println("Not allowed");
		}
		char b= a.charAt(0);
		boolean b1;
		b1= Character.isDigit(b);
		if (b1) System.out.println("pressed " +b);
		
		else  System.out.println("Not allowed");
		
	}
	public static void example() {
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string x=''10'';");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice: " );
		String s= sc.nextLine();
		while (!s.equals("c")) {
			System.out.println(" incorrect!");
			System.out.println("Again? press y to continue");
			String s1= sc.nextLine();
				while (!s1.equals("y")) {
					System.out.println("press y to continue");
					s1= sc.nextLine();
				} 
				System.out.println("Enter your choice: " );
				s= sc.nextLine();
		}
		  System.out.println(" Incorrect!");
	}
	public static void display(int n) {
		for (int i=0; i<n;i++) {
			for (int j=0; j<n-i; j++ ) {
				System.out.print("*");
				
			} System.out.println();
		}
	}
	public static void print(int n) {
		for (int i=1; i<=3;i++) {
			for (int j=1; j<=i; j++ ) {
				System.out.print(j);
			} for (int k=n-i; k>=1; k--) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}
	public static void example2() {
		System.out.println("What is the command keyword to exit a loop in Java?");
		System.out.println("a. int");
		System.out.println("b. continue");
		System.out.println("c. break");
		System.out.println("d. exit");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice: " );
		String s= sc.nextLine();
		while (!s.equals("b")) {
			System.out.println(" incorrect!");
			System.out.println("Again? press y to continue");
			String s1= sc.nextLine();
				while (!s1.equals("y")) {
					System.out.println("press y to continue");
					s1= sc.nextLine();
				} 
				System.out.println("Enter your choice: " );
				s= sc.nextLine();
		}
		  System.out.println(" correct!");
	}
	public static void printAsciivalue() {
		int i=1;
		while (i<=122) {
			System.out.print((char)i+"\t");
			if (i % 10 == 0)
			System.out.println("");
			i++;
		}
	}
	public static void example3() {
		System.out.println("What is the command keyword to exit a loop in Java?");
		System.out.println("a. int");
		System.out.println("b. continue");
		System.out.println("c. break");
		System.out.println("d. exit");
		Scanner sc= new Scanner(System.in);
		
		String s= "";
		do {
			if (!s.equals("")) {
				System.out.println(" Incorrect!");
				System.out.println("Again? press y to continue:"); 
				String s1= sc.nextLine();
				while (!s1.equals("y")) {
					System.out.println(" press y to continue:" ); 
					s1= sc.nextLine();
				}
				
		} System.out.println("Enter your choice: " );
		s= sc.nextLine();
	}
	while (!s.equals("b"));
		  System.out.println(" correct!");
	} 
	public static void example4() {
		int i=1;
		do {
			System.out.print((char)i+"\t");
			if (i % 10 == 0)
			System.out.println("");
			i++;
		} while (i<123);
	}
	
}
