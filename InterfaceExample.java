package oops;

	interface Institute //interface can have abstract methods only
	{
		abstract void register();
		abstract void infra();
		abstract void students();
		void staff(); // abstract keyword na bhi likho toh chalega, bcs its abstract and public by default
	}
	class ABES implements Institute
	{
		public void register()// all methods have to be public kyunki yahan pe ye methods by default public nahi hain
		{
			System.out.println("ABES is registered with AKTU and NAAC.");
		}
		public void infra()
		{
			System.out.println("ABES has digital classrooms and labs.");
		}
		public void students()
		{
			System.out.println("Admissions through counselling.");
		}
		public void staff()
		{
			System.out.println("ABES has well trained staff.");
		}


	public static void main(String[] args) {
		Institute ii=new ABES(); // abstract class ka object nahi ban sakta thats why we make child class's object
		ii.register();
		ii.infra();
		ii.students();
		ii.staff();
		
	}

}
