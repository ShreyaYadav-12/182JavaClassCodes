package oops;

public class constructor1 {
	int id;
	String name;
	constructor1() //default constructor
	{
		id=101;
		name="shreya";
	}
	constructor1(int id, String name)// parameterized constructor
	{
		
	}
	public void displayMethod()
	{
		System.out.println("Name and id is: "+name+" "+id);
	}

	public static void main(String[] args) {
		constructor1 c1=new constructor1();
		c1.displayMethod();
		constructor1 c2=new constructor1(102,"shretz");
		c2.displayMethod();
	}

}
