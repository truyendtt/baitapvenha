package day2;

import java.util.Scanner;

public class Array {
	public static void GradesAverage () {
		int [] grades= new int[100];
		int sum=0;
		System.out.println("nhap so luong sinh vien:" );
		Scanner SL= new Scanner(System.in);
		int n = SL.nextInt();
		for (int i=1; i<=n; i++) {
			 
			System.out.print("Enter the grade for student" +i +":");
			Scanner point= new Scanner(System.in);
			grades[i]= point.nextInt();
			if (0>grades[i]|| grades[i] >100)
			{
			 System.out.println("Invalid grade, try again...");
			 System.out.print("Enter the grade for student" +i +":");
			 grades[i]= point.nextInt();
			}

		 sum= sum+ grades[i];
	}
		float ave=sum/n;
		System.out.println("The average is:" +ave);
	}
	public static int[] nhapphantu(int n) {
		int []array = new int[n];
		for (int i=0; i<=n-1;i++) {
		System.out.print("Enter phan thu thu " +i+ " trong mang: ");
		Scanner a= new Scanner(System.in);
		array[i]= a.nextInt();
		} return array;
	}
		public static void printArray(int n) {
			int [] array = new int[n];
			for (int i=0; i<=n-1;i++) {
			System.out.print("Enter phan thu thu " +i+ " trong mang: ");
			Scanner a= new Scanner(System.in);
			array[i]= a.nextInt();
			}
			
			if(array.length>0){
				System.out.print("{");
				for(int i = 0; i< array.length; i++){
					if (i== array.length-1) {
						System.out.print(array[i]);
					}  else System.out.print(array[i]+",");
				}
				System.out.println("}");

				} else System.out.println("Mang chua co phan tu nao");
				
			
			}
		public static String arrayToString(int[] array2) {
			String st="";
			if(array2.length>0){
				st= st + "{";
				for(int i = 0; i< array2.length; i++){
					if (i== array2.length-1) {
						st= st + array2[i];
					}  else st= st + array2[i]+",";
				}
				st= st +"}";

				} else { System.out.println("Mang chua co phan tu nao");} 
			return st;
		}

}