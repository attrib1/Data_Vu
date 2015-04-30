package lab8;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		 new ScoreStudent("Hi", 40.0, 50.2);

	}
}

class ScoreStudent {
	public String name;

	public ScoreStudent(String name, double quiz, double fiNalTest) {
		double total = quiz + fiNalTest;
		System.out.println("Name : "+name);
		System.out.println("Quize : "+quiz);
		System.out.println("Final : "+fiNalTest);
		System.out.println("Total : "+total);
		if (total >= 50)
			System.out.println("Grade : S");
		else
			System.out.println("Grade : I");
	}
}
