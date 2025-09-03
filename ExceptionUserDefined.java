package oops;


	class InvalidEmployeeId extends Exception{
	InvalidEmployeeId(String message)
	{
		super(message);
	}
	}
	
	class employee{
		int empID;
		String name;
		
		employee(int empID, String name) throws InvalidEmployeeId{
			if(empID<=0)
			{
				throw new InvalidEmployeeId("Employee ID must be positive");
			}
			this.empID=empID;
			this.name=name;
			System.out.println("Employee created: "+empID+"-"+name);
		}
	}

	public class ExceptionUserDefined {
		
	public static void main(String[] args) {
		try {
			employee e1=new employee(101,"Shreya");// valid
			employee e2=new employee(0,"Meera");// invalid
		}
		catch(InvalidEmployeeId e)
		{
			System.out.println("Custom exception: "+e);
		}
		
		}
	}
