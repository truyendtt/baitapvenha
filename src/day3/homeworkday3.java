package day3;

//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class homeworkday3 {
	public static void print() {
		String name;
		Random generator = new Random();
		int value = generator.nextInt(7000)+1;
		Scanner sc= new Scanner(System.in);
		System.out.print("nhap ten cua ban: ");
		name= sc.nextLine();
		System.out.println(name + "_" + generator.nextInt(value));
	}
	public static void printcalendar() {
		Calendar cal= Calendar.getInstance();
		System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	}
	public static void maindate(String day1, String day2) throws ParseException {
		
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
        Date date1 =  sdf.parse(day1);  
        Date date2 =  sdf.parse(day2);  
        
        System.out.println("Date 1: " + sdf.format(date1));  
        System.out.println("Date 2: " + sdf.format(date2));  
        if(date1.compareTo(date2) > 0)   
        {  
        System.out.println("Date 1 comes after Date 2");  
        }   
        else if(date1.compareTo(date2) < 0)   
        {  
        System.out.println("Date 1 comes before Date 2");  
        }   
        else if(date1.compareTo(date2) == 0)   
        {  
        System.out.println("Both dates are equal");  
        }  
	}
	public static void showcalendar() {
		Calendar c = Calendar.getInstance();
		System.out.println(" " + c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(" " + c.get(Calendar.DAY_OF_MONTH) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.YEAR));
		
		System.out.println(" " + c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH)//
				+ " " + c.get(Calendar.HOUR_OF_DAY) + ":" +c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
		
		System.out.println( " "+c.get(Calendar.HOUR_OF_DAY) + ":" +c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "." +c.get(Calendar.MILLISECOND));
		System.out.println(" " + c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH)//
		+ " " + c.get(Calendar.HOUR_OF_DAY) + ":" +c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)+ "." +c.get(Calendar.MILLISECOND));
		System.out.println(" " + c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH)//
		+ " " + c.get(Calendar.HOUR_OF_DAY) + ":" +c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)+ "." +c.get(Calendar.MILLISECOND) + " +" +c.get(Calendar.ZONE_OFFSET));
	}
}
