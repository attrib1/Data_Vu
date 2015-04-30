package lab6;

import java.util.Scanner;

public class lab5_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student stu1 = new Student();
	
		
		System.out.print("กรุณาใส่ชื่อ : ");
		String data = scan.nextLine();
		stu1.getName(data);
		
		System.out.print("กรุณาใส่รหัสนักศึกษา : ");
		 data = scan.nextLine();
		 stu1.getId(data);
		
		System.out.print("กรุณาใส่เกรด : ");
		Float data2 = scan.nextFloat();
		stu1.getGpa(data2);
		
		stu1.showData();
		
		

	}
}

class Student {
	String Id;
	String Name;
	Float Gpa;
	public Student() {
		
	}

	public void getName(String n) {
		
		Name = n;

	}

	public void getId(String n) {
		Id = n;

	}

	public void getGpa(Float n) {
		Gpa = n;

	}

	public void showData() {
		System.out.println("ชื่อ : "+Name);
		System.out.println("รหัส : "+Id);
		System.out.println("เกรด : "+Gpa);

	}
}