package oops;

import java.util.Scanner;

class EmployeeEncap{
	private int acc_bal; // data hiding
	private int upi_pin=1111;
	
public void setBal(int bal)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter UPI pin");
	int pin=sc.nextInt();
	if(pin==upi_pin)
	{
		acc_bal=bal;
		System.out.println("Congratulations! Salary is credited");
	}
	else
	{
		System.out.println("Salary not credited");
	}
}

public int getbalance(){
    Scanner sc=new Scanner(System.in);
    System.out.println("To know the balance please enter UPI pin");
    int pin=sc.nextInt();
    if(pin==upi_pin){
        System.out.println("Available balance is:" + acc_bal);
        return acc_bal;
    }
    else{
        System.out.println("WRONG PIN");
    }
    return -1;
}

}

public class Encapsulation {

	public static void main(String[] args) {
		EmployeeEncap ee= new EmployeeEncap();
		ee.setBal(90000);
		ee.getbalance();

	}

}
// setter (setbal) and getter(getbalance) both methods should be public
