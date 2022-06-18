package day2;

public class Controlstatement {
	public static void printDatofWeek(int n) {
		switch(n) {
		case 2:
			System.out.println("Thu hai");
			break;
		case 3:
			System.out.println("Thu ba");
			break;
		case 4:
			System.out.println("Thu tu");
			break;
		case 5:
			System.out.println("Thu nam");
			break;
		case 6:
			System.out.println("Thu sau");
			break;
		case 7:
			System.out.println("Thu bay");
			break;
		case 8:
			System.out.println("Chu nhat");
			break;
		default :
		System.out.println("nhap lai n");
		break;
		}
	}
	public static void sum(int n) {
		int sum=0;
		float ave =0;
		for (int i =1; i<=n; i++)
		{
			sum= sum + i;	 
			ave= sum/i;
		}
		ave= sum/n;
		
		System.out.println("tong " + sum);
		System.out.println(" trung binh" + ave);

		
	}
	/*public int searchByChar(String s) { // public int la phai khai bao kieu int 
		int result = -1;
		//khai bao mang 1 chieu kieu char co so phan ty toi da s.size
		char[] helloArray= new char[s.length()];
		for (int i=0; i<s.length(); i++)
		{
			helloArray[i] = s.charAt(i);
		}
		int k=0;
		while (k<s.length()-1) {
			for (int j=0; j<helloArray.length; j++) {
				if(helloArray[j].equals(s)) {
					return result =j;
				} else {
					result = -1;
				}
			}
		}
		return result;
		}*/
	public static void sumAndAverageEx2(int n) {
		int sum=0;
		double ave=0;
		int count=0;
		for (int i=111; i<n; i++) {
			sum= sum +i;
			count ++;
		}
		 ave =sum/count;
		 System.out.println("The sum " + sum);
		 System.out.println("The average " + ave);
	}
	
	public static void Sumofnumbersdivisible7(int n) {
		int sum=0;
		int count=0;
		float ave=0;
		for (int i =1; i<=n; i++) {
			if (i%7==0) {
				sum=sum +i;
				count ++;	
			}
		}
		 ave =sum/count;
		 System.out.println("The sum " + sum);
		 System.out.println("The average " + ave);
	}
	public static void sumAndAverageEx3(int n) {
		int sum=0;
		int count=0;
		float ave=0;
		for (int i =1; i<=n; i++) {
			if (i%2==1) {
				sum=sum +i;
				count ++;	
			}
		}
		 ave =sum/count;
		 System.out.println("The sum " + sum);
		 System.out.println("The average " + ave);
	}
	
	public static void sumofthesquares(int n) {
		int sum=0;
		
		for (int i =1; i<=n; i++) {
			
				sum=sum +i*i;
				i++;	
		}
		 System.out.println("sum of the squares of all the numbers from 1 to 100 is  " + sum);
	}
	public static void HarmonicSum(int n) {
		double sum=0.0;
		double i=1;
		while (i<=n) {
			
				sum=sum +1/i;
				i++;
				
		}
		 System.out.println("Harmonic  = " + sum);
	}
	public static void sprintString(int n) {
		for (int i=0; i<+n; i++) {
			for (int j=0; j<=n; j++) {
			System.out.print("# ");
		} System.out.println( );
		}
		}
	
	public static void sprintString2(int n) {
		for (int i=0; i<+n; i++) {
			for (int j=0; j<n; j++) {
			if (i%2==0) System.out.print("# ");
			else System.out.print(" " +"#");
		} System.out.println( );
		}
		
	}
}
