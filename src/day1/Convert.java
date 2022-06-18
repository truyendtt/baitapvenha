package day1;

public class Convert {
	public static void convert(float f) {
		Float c;
		c= (f-32)*5/9;
		System.out.println("212.0 degree Fahrenheit is equal to " +c +" in Celsius");
	}
	public static void convertInchtoMeter(float inch) {
		float meter = 0.0254f*inch;
		System.out.println("1000.0 inch is " +meter + "\n\n");
	}
	public static void speed(float meter, float hour, float min, float s) {
	
		float speedMs = meter / (hour*3600 + min*60 + s);
		float speedKmH = (meter/1000)/ (hour + min/60 + s/3600);
		float speedMileH = (meter/1609f)/ (hour + min/60 + s/3600);
		System.out.println(" Your speed in meters/second is " + speedMs);
		System.out.println(" Your speed in km/h is " + speedKmH);
		System.out.println(" Your speed in miles/h is " + speedMileH);
	}
	
	public static void math(int a, int b) 
	{
		int sum = a+b;
		int pro= a*b;
		float ave= (a+b)/2;
		int diff= a-b;
		int dis= Math.abs(a-b);
		if (diff>0)
			{
			System.out.println(" Max integer: " + a);
			System.out.println(" Min integer:  " + b);
			} 
		else if (diff <0) {
			System.out.println(" Max integer: " + b);
			System.out.println(" Min integer: " + a);
			}
		else System.out.println(" bang nhau ");
		System.out.println("Sum of two integers: " + sum);
		System.out.println("Difference of two integers " + diff);
		System.out.println("Product of two integers: " + pro);
		System.out.println("Average of two integers: " + ave);
		System.out.println("Distance of two integers: " +dis);
	}
	
	public static void breakInt(int number) {
		String str= String.valueOf(number); // ép kiểu sổ sang string
		String[] array= str.split("");			// khai báo mảng, str.split("") tách kí tự trong chuỗi str
		for (int i=0; i < array.length; i++)
		{
			String value= array[i];
			int reInt= Integer.parseInt(value);  //Integer.parselnt() chuyển string sang int
			System.out.println(reInt);
		}
		
	}
	
	public static void sumdigits(int num) {
		String str = String.valueOf(num);
		String[] arr = str.split("");
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			String value= arr[i];
			int digits= Integer.parseInt(value);
			sum= sum + digits;
		}
		System.out.println("The sum of all 1 in 565 is: " +sum);
	}
	public static void covertMintoDate(int min ) {
		int years= min/(24*60*365);
		int days= (min - years*(24*60*365))/(24*60);
		System.out.println("3456789 minutes is approximately: " +years +" years " + days+ " days");
	}
}
