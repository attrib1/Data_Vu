package lab6;

import java.util.Scanner;

class TestEmployee {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emp = new Employee(0, null);

		System.out.print("ระบุชื่อ : ");
		String name = scan.nextLine();

		System.out.print("ระบุรหัสพนักงาน : ");
		int id = scan.nextInt();

		System.out.print("ระบุตำแหน่ง  : ");
		int type = scan.nextInt();

		System.out.print("ระบุเงินเดือน : ");
		double salary = scan.nextDouble();

		// Input method
		emp.getID(id);
		emp.getName(name);
		emp.getSalary(salary);
		emp.getType(type);

		emp.ShowData();

	}

}

class Employee {
	private int id; // Employee id
	private String name; // Employee name
	private int type; // 1 = employee, 2 = manager
	private double baseSalary; // Base salary

	public Employee(int i, String n) {
		id = i;
		name = n;

	}// Constructor

	public void getType(int type) {
		this.type = type;

	}

	public void getID(int id) {
		this.id = id;

	}// id accessor

	public void getName(String n) {
		name = n;

	}// name accessor

	public void getSalary(double s) {

		baseSalary = s;

	}// if manager, add 10% to base salary

	public void setID() {
		System.out.println("ID : " + id);
	}// id mutator

	public void setName() {
		System.out.println("name : " + name);

	}// name mutator

	public void setBaseSalary() {
		if(type==1){
		System.out.println("Sarlary : " + baseSalary);
		}else{
			baseSalary = baseSalary+((baseSalary*10)/100);
			System.out.println("Sarlary : " + baseSalary);
		}
	}// sets base salary.

	public void setType() {
		if (type == 1) {
			System.out.println("Type : employee");
		} else {
			System.out.println("Type : manager");
		}

	}

	public void ShowData() {
		setName();
		setID();
		setType();
		setBaseSalary();
	}
}
