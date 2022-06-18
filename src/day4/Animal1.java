package day4;

public class Animal1 {
	public String name;
	  public String color;
	  public int height;
	  public int wide;
	  
	  
	 
	  //constructor
	  // ten ham trung voi ten class
	  // contructor k co kieu tra ve. k co void hoac return
	  
	  
	  // cach 1: construtor k co tham so
	  public Animal1() {
	 
	   name = "miu";
	   color= "vang";
	   height= 30;
	   wide=15;
	  }
	  //cach 2: constructor co tham so
	  public Animal1(String constructorName, String constructorColor, int constructorHeight, int constructorWide) {
	   
	   name = constructorName;
	   color= constructorColor;
	   height= constructorHeight;
	   wide= constructorWide;
	  }
	  
	  
	 public void shout()
	 {
	  System.out.println("Hello!!!" + this.name);
	  System.out.println("I'm shouting!!!" );
	 }
	 public void run() {
	  System.out.println("I'm running");
	 }
}
