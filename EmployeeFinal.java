package dsa;

public class EmployeeFinal {
    int emp_id;
    final static String org = "KIET";//made it final, now its value cannot be changed or updated

     void details(){
        System.out.println("ID : " + emp_id + "  org : " + org);
    }

    public static void main(String[] args) {
        EmployeeFinal emp = new EmployeeFinal();
        emp.emp_id = 51;
        //emp.org = "ABES";
        emp.details();
        
    }

    class faculty extends EmployeeFinal{
     void detailsOfEmp(){
        System.out.println("Welcome to Overriding");
     }   
    }

}