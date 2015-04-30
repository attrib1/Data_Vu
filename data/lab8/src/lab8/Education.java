package lab8;

import java.util.Scanner;

public class Education {
	public static void main(String[] args) {
		
		 new Educate("Hi", 99);
		
	}
}
class Educate {
	public String name;
	
	public Educate(String name, int score) {
		System.out.println("Name :"+name);
		if (score >= 80)
			System.out.println("Grade : A");

		else if (score >= 70)
			System.out.println("Grade : B");
		else if (score >= 60)
			System.out.println("Grade : C");
		else if (score >= 50)
			System.out.println("Grade : D");
		else
			System.out.println("Grade : F");
	}
	
}
