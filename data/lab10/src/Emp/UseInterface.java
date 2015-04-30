package Emp;

import java.util.Scanner;

public class UseInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InterfaceTest In = new InterfaceTest();
		System.out.print("Enter OT Rate (�/Hr) : ");
		double salary = sc.nextDouble();
		System.out.print("Enter OT HOUR : ");
		int hr = sc.nextInt();	
		In.setOT(salary);
		System.out.println("Total OT  : "+In.calOT(hr, salary)+ " BATH");
		sc.close();
	}

}

interface Employee2 {
	void setOT(double s);
	double calOT(int h, double s);
}

class InterfaceTest implements Employee2 {

	@Override
	public void setOT(double s) {
		System.out.println("OT Rate = "+ s +" Bath/HR.");

	}

	@Override
	public double calOT(int h, double s) {
		return h * s;

	}

}