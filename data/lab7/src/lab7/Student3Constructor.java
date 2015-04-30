package lab7;

import java.util.Scanner;

public class Student3Constructor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student2 Std = new Student2(null, null, 0, 0, null);

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
		scan.close();
		
		Std.setID(idStu);
		Std.setName(nameStu);
		Std.setAge(ageStu);
		Std.setgrade(score, score1, score2);
		Std.getInfoStudent();

	}

}

class Student2 {
	public String idStu;

	public String nameStu;

	private int ageStu;

	private int score;

	private String gradeStu;

	public Student2(String id, String name, int age, int score, String grade) {
		idStu = id;
		nameStu = name;
		ageStu = age;
		this.score = score;
		gradeStu = grade;

	}

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
