package oops;

abstract class college //if class has abstract method then class has to be abstract too
{
	abstract void register();
	abstract void infra();
	abstract void students();
	abstract void staff();
	void medicalFacility()
	{
			System.out.println("Medical facilities are optional.");
	}
}
class KIET extends college// class KIET has to inherit all abstract methods of class college, otherwise error
{
	void register()
	{
		System.out.println("KIET is registered with AKTU and NAAC.");
	}
	void infra()
	{
		System.out.println("KIET has digital classrooms and labs.");
	}
	void students()
	{
		System.out.println("Admissions through counselling.");
	}
	void staff()
	{
		System.out.println("KIET has well trained staff.");
	}
	void medicalFacility()
	{
		System.out.println("KIET has its own hospital inside the campus.");
	}
}

public class abstractexample {

	public static void main(String[] args) {
		college clg=new KIET(); // abstract class ka object nahi ban sakta thats why we make child class's object
		clg.register();
		clg.infra();
		clg.students();
		clg.staff();
		clg.medicalFacility();
	}

}
