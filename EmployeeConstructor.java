package dsa;

public class EmployeeConstructor {
    int Emp_id;
    String Emp_name;

    EmployeeConstructor(int i,String name){
        Emp_id = i;
        Emp_name = name;
    }

    EmployeeConstructor(EmployeeConstructor emp1){
        Emp_id = emp1.Emp_id;
        Emp_name = emp1.Emp_name;
    }
    void printinfo(){
        System.out.println("Details of the Employee are: " + Emp_id + " and " + Emp_name);
    }

    public static void main(String[] args) {
        EmployeeConstructor emp1 = new EmployeeConstructor(10, "riya");
        emp1.printinfo();
        EmployeeConstructor copy; 
        copy = emp1; 
        copy.printinfo();

        copy.Emp_id = 12;
        copy.Emp_name = "Shreya";
        System.out.println("Changed Details : ");
        copy.printinfo();

        EmployeeConstructor copy2 = new EmployeeConstructor(emp1);
        copy2.printinfo();
        copy2.Emp_id = 21;
        copy2.Emp_name = "Ram";
        copy2.printinfo();
    }

  
}