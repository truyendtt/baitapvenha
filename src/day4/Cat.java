package day4;

public class Cat extends Animal {
	 public String foodtype;

	  public Cat (String constructorName, String constructorColor, int constructorHeight, int constructorWide) {
	   
	   name = constructorName;
	   color= constructorColor;
	   height= constructorHeight;
	   wide= constructorWide;
	  }
	 public void display() {
	  System.out.println("I'm " + this.name);
	  System.out.println("I'm eating " +this.foodtype);
	 }
	 
	 //overiding: ghi de
	 // giu nguyen method va paramter
	 public void shout() {
	  System.out.println("i'm running 2222 ");
	 }
	 // overloading = nap chong 
	 public void shout(String x) {
	  
	  System.out.println("i'm running 2222 ");
	 }
}
