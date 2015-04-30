package lab7;

import java.util.Scanner;

public class Student2Instance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student Std = new Student();

		System.out.print("ÃËÑÊ : ");
		String idStu = scan.nextLine();

		System.out.print("ª×èÍ : ");
		String nameStu = scan.nextLine();

		System.out.print("ÍÒÂØ: ");
		int ageStu = scan.nextInt();

		System.out.print("¤Ðá¹¹  quiz : ");
		int score = scan.nextInt();

		System.out.print("¤Ðá¹¹  mid : ");
		int score1 = scan.nextInt();

		System.out.print("¤Ðá¹¹  final : ");
		int score2 = scan.nextInt();

		Std.setID(idStu);
		Std.setName(nameStu);
		Std.setAge(ageStu);
		Std.setgrade(score, score1, score2);
		Std.getInfoStudent();

	}

}

class Student {
	public String idStu;

	public String nameStu;

	private int ageStu;

	private int score;

	private String gradeStu;

	public void getInfoStudent() {
		System.out.println("ÃËÑÊ : " + idStu);
		System.out.println("ª×èÍ : " + nameStu);
		System.out.println("ÍÒÂØ: " + ageStu);
		System.out.println("¤Ðá¹¹  : " + gradeStu);

	}

	public void setID(String id) {
		idStu = id;

	}

	public void setName(String name) {
		nameStu = name;

	}

	public void setAge(int age) {
		ageStu = age;

	}

	public void setgrade(int quiz, int mid, int finalTest) {
		int total = quiz + mid + finalTest;

		if (total >= 80)
			gradeStu = "A";
		else if (total >= 70)
			gradeStu = "B";
		else if (total >= 60)
			gradeStu = "C";
		else if (total >= 50)
			gradeStu = "D";
		else if (total < 50)
			gradeStu = "F";
	}
}