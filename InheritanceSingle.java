package dsa;
class Employee{
    int Emp_id;
    String Emp_name;
    static String Organisation="KIET";
    
    void details(){
        System.out.println("Emp ID: " +Emp_id +"\n"+"  Name: "+Emp_name+"\n"+"  Organisation: "+Organisation);
    }
}

class Faculty extends Employee{
    String Department;
    String subject;
    String Designation;
    void facultyDetails(){
        System.out.println("  Department: "+Department +"\n"+"  Subject: "+subject+"\n"+"  Designation:"+Designation);
    }  
    
}

public class InheritanceSingle{
    public static void main(String[] args) {
        
    Faculty f=new Faculty();
    f.Emp_id=101;
    f.Emp_name="Shreya";
    f.Department="cse-aiml";
    f.subject="oops";
    f.Designation="TA";

    System.out.println("Details of the Employee are");    
    f.details();
    f.facultyDetails();
    }
   
}
