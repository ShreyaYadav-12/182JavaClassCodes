package dsa;

public class EmployeeStatic {
	int emp_id;
	static String org; //static variable, used in memory management, belongs to class & not object
	void details()
	{
		System.out.println("ID: "+emp_id+" "+ "Organisation is: "+org);
	}
	

	public static void main(String[] args) {	
		EmployeeStatic.org="KIET";
		EmployeeStatic es=new EmployeeStatic();
		es.emp_id=101;
		es.details();
		
		EmployeeStatic es2=new EmployeeStatic();
		es2.emp_id=102;
		es2.details();
		
	}

}
