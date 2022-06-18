package day2;

import java.util.Scanner;

public class Method {
	public static boolean isOdd(int number) {
		if(number%2==0) {
			return true;
		}
		return false;
	}
	public static boolean hasEight (int num) {
		
		String st= String.valueOf(num);
		String [] array= st.split("");
		for (int i=0; i<= array.length; i++) {
			String value= array[i];
			 int re= Integer.parseInt(value);
			if (re==8) {
				return true;
			} return false;
		}
		return false;
	}
	public static void MagicSum() {
		 int sum =0;
		 int num=0;
		 while (num!=-1) {
			 Scanner sc1= new Scanner(System.in);
			System.out.print("Enter a positive integer or -1 to exit: ");
			num  = sc1.nextInt();
			if (num!=-1) {
				boolean res= Method.hasEight(num);
				 if (res==true) {
					 sum=sum + num;
				 } 
			}
		 }System.out.println("tong = " +sum);
		
	} 
}
