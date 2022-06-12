package common;

import java.util.Scanner;

import day1.DataTypesandVariables;
import day2.Array;
//import day1.DataTypesandVariables;
import day2.Controlstatement;
import day2.Method;

public class Main {

	public static void main(String[] args) {
		// goi ham k co static class DataTypesandVariables printString
		//DataTypesandVariables dataTypesandVariables = new DataTypesandVariables();
		//dataTypesandVariables.printString("hello");
	
	// cach 2 co static
		/*
		System.out.println("***BAI 1 ***" + "\n");
		DataTypesandVariables.printString("hello world" + "\n");
		
		System.out.println("***BAI 2 ***" +"\n" );
		DataTypesandVariables.printString("++++++"+"\n\n" + "@@@@@@"+ "\n\n" + "******" + "\n\n" +"######"+ "\n\n");
		System.out.println("***BAI 3 ***" +"\n" );
		byte a = 10;
		float b =10.3f;
		float c= 3.14785f;
		DataTypesandVariables.printString("" +a);
		DataTypesandVariables.printString("" +b);
		DataTypesandVariables.printString("" +c);
		
		System.out.println("***day 2 BAI 1 ***" + "\n");
		System.out.println("nhap n: " );
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Controlstatement.printDatofWeek(n); */
		
		Controlstatement.sum(100);
		DataTypesandVariables.printString("-------- HOME WORK DAY 2  -------- \n");
		DataTypesandVariables.printString("--------- LOOP: BAI 2  ---------- \n");
		Controlstatement.sumAndAverageEx2(8900);
		
		DataTypesandVariables.printString("--------- LOOP: BAI 3  ---------- \n");
		Controlstatement.sumAndAverageEx3(100);
		
		DataTypesandVariables.printString("--------- LOOP: BAI 4  ---------- \n");
		Controlstatement.Sumofnumbersdivisible7(100);
		
		DataTypesandVariables.printString("--------- LOOP: BAI 5  ---------- \n");
		Controlstatement.sumofthesquares(100);
		
		DataTypesandVariables.printString("--------- LOOP: BAI 6  ---------- \n");
		Controlstatement.HarmonicSum(2);
		DataTypesandVariables.printString("--------- LOOP: BAI 7  ---------- \n");
		Controlstatement.sprintString(5);
		DataTypesandVariables.printString("--------- LOOP: BAI 8  ---------- \n");
		Controlstatement.sprintString2(7);
		DataTypesandVariables.printString("--------- METHOD: BAI 1  ---------- \n");
		System.out.println("nhap so ");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		//Method.isOdd(number);
		boolean answer= Method.isOdd(number);
		if(answer==true) {
			System.out.println("EVEN");
			
		} else System.out.println("ODD"); 
		DataTypesandVariables.printString("--------- METHOD: BAI 2  ---------- \n");
		System.out.println("nhap so ");
		Scanner Num= new Scanner(System.in);
		int num = Num.nextInt();
		boolean result=Method.hasEight(num);
		if (result == true)
		{
			System.out.println("true");
			
		}else System.out.println("flase"); 
		
		DataTypesandVariables.printString("--------- METHOD: BAI 3  ---------- \n");

		Method.MagicSum();
		
		DataTypesandVariables.printString("--------- ARRAY: BAI 1  ---------- \n");
		Array.GradesAverage(); 
		DataTypesandVariables.printString("--------- ARRAY: BAI 2  ---------- \n");
		Array.printArray(2);
		DataTypesandVariables.printString("--------- ARRAY: BAI 3  ---------- \n");
		/*int [] array2= new int[2];
				array2[0]=2;
				array2[1]=3; */
		int[] array2= Array.nhapphantu(2);
		System.out.println(Array.arrayToString(array2));
	}
}
	

