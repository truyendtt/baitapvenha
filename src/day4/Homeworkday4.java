package day4;

import java.util.Scanner;

public class Homeworkday4 {
	public static void main1() {
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");

	}
	public static void inchuoi(String st) {
		System.out.println(st);
	}
	public static void printWeird(int n) {
		if (n%2!=0) {
			System.out.println("Weird");
		} else if (n%2==0 && n>=2 && n<5) {
			System.out.println("Not Weird");
		}else if (n%2==0 && n>=6 && n<20) {
			System.out.println(" Weird");
		} else if (n%2==0 && n>20) {
			System.out.println("Not Weird");
		}
	}
	public static void printN(int n) {
		for (int i=1; i<=10;i++) {
			System.out.println(n*i);
		}
	}
	public static void printSize() {
		int [] arr= {1, 2, 3, 4, 5, 6}; 
		System.out.println(arr.length);
	}
	public static void printvalue() {
		int [] arr= {1, 2, 3, 4, 5, 6}; 
		for (int i=0;i<arr.length; i++) {
		System.out.println(arr[i]);
		}
	}
	public static void printMethod() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i = 0; i < 8; i++){
			System.out.println(numbers[i]);
			}	
		}
	public static void convertArray3() {
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[][] B= new int[3][3];
		
		int k=0;
		for (int i=0; i<3;i++) {
			for (int j=0; j<3; j++ ) {
				B[i][j]=number[k++];
				System.out.print(B[i][j] );
			} System.out.println();
		}	
	}
	public static void display() {
		for (int i=1; i<6;i++) {
			for (int j=1; j<6; j++ ) {
				System.out.print("*");
				
			} System.out.println();
		}
	}
	public static void varible() {
		
		int a=10; float b=12.5f; String st= "Java programming";
		System.out.println(a);
		System.out.println(b);
		System.out.println(st);
		}
	public static void coverttoInt() {
		String st="20";
		int a= Integer.parseInt(st);
		System.out.println(a);
	}
	public static void aveOfPrice() {
		System.out.println("nhap gia laptop:" );
		Scanner sp= new Scanner(System.in);
		int priceLaptop= sp.nextInt();
		System.out.println("nhap gia PC:" );
		int pricePC= sp.nextInt();
		System.out.println("nhap gia projection:" );
		int priceprojection= sp.nextInt();
		System.out.println(" average price of these three products: "+ (priceLaptop+pricePC+priceprojection)/3f);
	}
	public static void convertString(String s) {
		char s1= s.charAt(s.length()-1);
		String s2= s.substring(0,s.length()-1);
		s= s1+s2;
		System.out.println(s);
	}
	public static void deteleSpace(String s) {
		String s1= s.replaceAll("\\s", "_");
		char s2= s1.charAt(s1.length()-1);
		String s3= s1.substring(0,s1.length()-1);
		System.out.println(s3);
		
		}
	
}
