package oops;

 public class EmployeePoly {
	String Emp_name;
	
	void details()
	{
		System.out.println("Name: "+Emp_name);
	}
	void details(int salary)
	{
		System.out.println("Salary: "+salary);
	}
	void details(String company)
	{
		System.out.println("Institute name: "+company);
	}
//	class faculty extends EmployeePoly()
//	{
//		void details()
//		{
//			super.details();
//			System.out.println("Welcome Faculties.");
//		}
//	}
	public static void main(String[] args) {
		EmployeePoly ep=new EmployeePoly();
		ep.Emp_name="Shreya";
		ep.details();
		ep.details(5000);
		ep.details("KIET");
		
//		faculty f=new faculty();
//		f.details();
	}
	
}
