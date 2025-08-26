package dsa;

public class methodDemo{ 

    int id;
    String name;
    
    methodDemo(int id,String name){//parameterized constructor
        System.out.println("Details are:" + id + " " + name);
        this.id = id;
        this.name = name;
    }
        public void displayMethod(){
        System.out.println("Hello from display method");
        System.out.println("Details are:" + id + " " + name);
    }
    


    public static void main(String[] args) {

        methodDemo m3 = new methodDemo(12, "Shreya");
        m3.displayMethod();
        
    }
}