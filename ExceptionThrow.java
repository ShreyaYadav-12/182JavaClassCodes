package oops;
class example{
	int salary;
	
	example(int salary) throws IllegalArgumentException // inbuilt exception
	{
		if(salary<=0)
		{
			throw new IllegalArgumentException("Salary must be greater than 0"); // actual throw
		}
	}
}

public class ExceptionThrow {

	public static void main(String[] args) {
//		int age=15;
//		if(age<18)
//		{
//			throw new ArithmeticException("Not eligible to vote");
//		}
//		System.out.println("Eligible to vote");
		try {
			example e= new example(0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	
}