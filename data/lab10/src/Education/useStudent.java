package Education;

import java.io.IOException;
import java.util.Scanner;

import Grade.*;

public class useStudent {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Student st = new Student("", "", 0.0, "", "");
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter ID : ");
			st.Id = scan.next();	
			System.out.print("Enter Name : ");
			st.name = scan.next();	
			System.out.print("Enter Subject : ");
			st.subject = scan.next();	
			System.out.print("Enter Total : ");
			st.total = scan.nextDouble();
			st.calStudent(st.total);
			System.out.println("Grade : "+st.grade);
			System.out.println("----------------------------");
		
		}
		for (int i = 1; i <= 2; i++) {
			System.out.print("Enter ID : ");
			st.Id = scan.next();	
			System.out.print("Enter Name : ");
			st.name = scan.next();	
			System.out.print("Enter Subject : ");
			st.subject = scan.next();	
			System.out.print("Enter finaltest : ");
			 double	 fin = scan.nextDouble();
			System.out.print("Enter mid : ");
			 double mid = scan.nextDouble();
			System.out.print("Enter homework : ");
			 double hw  = scan.nextDouble();
			st.calStudent(fin,mid,hw);
			System.out.println("Grade : "+st.grade);
			System.out.println("----------------------------");
		
		}
		for (int i = 1; i <= 2; i++) {
			System.out.print("Enter ID : ");
			st.Id = scan.next();	
			System.out.print("Enter Name : ");
			st.name = scan.next();	
			System.out.print("Enter Subject : ");
			st.subject = scan.next();	
			System.out.print("Enter finaltest : ");
			 double	 fin = scan.nextDouble();
			System.out.print("Enter mid : ");
			 double mid = scan.nextDouble();
			System.out.print("Enter homework : ");
			 double hw  = scan.nextDouble();
			 System.out.print("Enter quiz : ");
			 double quiz  = scan.nextDouble();
			st.calStudent(fin,mid,hw,quiz);
			System.out.println("Grade : "+st.grade);
			System.out.println("----------------------------");
		
		}
		System.in.read();
	}
}
