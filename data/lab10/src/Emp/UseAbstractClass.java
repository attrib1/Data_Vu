package Emp;
import java.util.Scanner;

public class UseAbstractClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Staff st =  new Staff();
		System.out.print("Enter OT Rate (�/Hr) : ");
			double salary = sc.nextDouble();
		System.out.print("Enter OT HOUR : ");
			int hr = sc.nextInt();	
			st.setOt(salary);
			System.out.println("Total OT  : "+st.calOt(hr, salary)+ "BATH");
			sc.close();
			
	}

}//End UseAbstractClass

abstract class Employee {

	public abstract void setOt(double a);

	public double calOt(int h, double s) {
		return h * s;
	}
	public abstract void setName(String n);
	
}//End Employee

class Staff extends Employee {
	@Override
	public void setOt(double a) {
		System.out.println("OT Rate = "+ a +"Bath/Hr");

	}

	@Override
	public void setName(String n) {
		System.out.println("Name : "+n);


	}

}//End Staff