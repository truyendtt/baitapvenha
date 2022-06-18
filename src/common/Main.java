package common;

import java.text.ParseException;
import java.util.Scanner;

import day1.DataTypesandVariables;
import day2.Array;
//import day1.DataTypesandVariables;
import day2.Controlstatement;
import day2.Method;
import day3.homeworkday3;
import day4.Conditionstatements;
import day4.Homeworkday4;

public class Main {

	public static void main(String[] args) throws ParseException  {
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
		Controlstatement.printDatofWeek(n); 
		
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
		int [] array2= new int[2];
				array2[0]=2;
				array2[1]=3; */
		//int[] array2= Array.nhapphantu(2);
		//System.out.println(Array.arrayToString(array2)); 
		// day 4 
		DataTypesandVariables.printString("--------- Day 3: BAI 1  ---------- \n");
		homeworkday3.print();
		DataTypesandVariables.printString("--------- Day 3: BAI 2  ---------- \n");
		homeworkday3.printcalendar();
		DataTypesandVariables.printString("--------- Day 3: BAI 3  ---------- \n");
		
		DataTypesandVariables.printString("--------- Day 3: BAI 4  ---------- \n");
		homeworkday3.showcalendar();
		
	
			DataTypesandVariables.printString("--------- Java language: BAI 1  ---------- \n");
			Homeworkday4.main1();
			DataTypesandVariables.printString("--------- Java language: BAI 2  ---------- \n");
			Homeworkday4.inchuoi("Hello, World.");
			Homeworkday4.inchuoi("Hello, Java.");
			DataTypesandVariables.printString("--------- Java language: BAI 3  ---------- \n");
			Homeworkday4.printWeird(4);
			DataTypesandVariables.printString("--------- Java language: BAI 4  ---------- \n");
			Homeworkday4.printN(5);
			DataTypesandVariables.printString("--------- Data Structure: BAI 5  ---------- \n");
			Homeworkday4.printSize();
			
			DataTypesandVariables.printString("--------- Data Structure: BAI 6  ---------- \n");
			Homeworkday4.printvalue();
			DataTypesandVariables.printString("--------- Data Structure: BAI 7  ---------- \n");
			Homeworkday4.printMethod();
			DataTypesandVariables.printString("--------- Data Structure: BAI 8  ---------- \n");
			Homeworkday4.convertArray3();
			DataTypesandVariables.printString("---------  Java basic: BAI 1  ---------- \n");
			Homeworkday4.display();
			DataTypesandVariables.printString("---------  Java basic: BAI 2  ---------- \n");
			Homeworkday4.varible();
			DataTypesandVariables.printString("---------  Java basic: BAI 3  ---------- \n");
			Homeworkday4.coverttoInt();
			
			DataTypesandVariables.printString("---------  Java basic: BAI 4  ---------- \n");
			
			Homeworkday4.aveOfPrice();
			DataTypesandVariables.printString("---------  Java basic: BAI 5  ---------- \n");
			Homeworkday4.convertString("2000$");
			DataTypesandVariables.printString("---------  Java basic: BAI 6  ---------- \n");
			Homeworkday4.deteleSpace("Welcome to Java Basic ");
			
			DataTypesandVariables.printString("---------  Condition statements: BAI 7  ---------- \n");
			Conditionstatements.comparetoString("A", "b");
			
			DataTypesandVariables.printString("---------  Condition statements: BAI 8  ---------- \n");
			Conditionstatements.age();
			DataTypesandVariables.printString("---------  Condition statements: BAI 9  ---------- \n");
			Conditionstatements.evenNumber(22);
			DataTypesandVariables.printString("---------  Condition statements: BAI 10  ---------- \n");
			Conditionstatements.studentGrade(80, 68, 90);
			DataTypesandVariables.printString("---------  Condition statements: BAI 11  ---------- \n");
			Conditionstatements.revenue(110);
			DataTypesandVariables.printString("---------  Condition statements: BAI 12  ---------- \n");
			Conditionstatements.number(); 
			DataTypesandVariables.printString("---------  Condition statements: BAI 13  ---------- \n");
			Conditionstatements.example();
			DataTypesandVariables.printString("---------  Condition statements: BAI 14  ---------- \n");
			Conditionstatements.display(7);
			DataTypesandVariables.printString("---------  Condition statements: BAI 15  ---------- \n");
			Conditionstatements.print(7);
			DataTypesandVariables.printString("---------  Condition statements: BAI 16  ---------- \n");
			Conditionstatements.example2();
			DataTypesandVariables.printString("---------  Condition statements: BAI 17  ---------- \n");
			Conditionstatements.printAsciivalue(); 
			DataTypesandVariables.printString("---------  Condition statements: BAI 18  ---------- \n");
			Conditionstatements.example3();
			DataTypesandVariables.printString("---------  Condition statements: BAI 19  ---------- \n");
			Conditionstatements.example4();
			
		}
}