package lab7;

import java.util.Scanner;

public class Student4Overloading {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student3 Std = new Student3(null, null, 0, 0,null);

		System.out.print("���� : ");
		String idStu = scan.nextLine();

		System.out.print("���� : ");
		String nameStu = scan.nextLine();

		System.out.print("����: ");
		int ageStu = scan.nextInt();

		System.out.print("��ṹ  quiz : ");
		int score = scan.nextInt();

		System.out.print("��ṹ  mid : ");
		int score1 = scan.nextInt();

		System.out.print("��ṹ  final : ");
		int score2 = scan.nextInt();
		scan.close();

		Std.setInfo(idStu,nameStu);
		Std.setInfo(ageStu);
		
		Std.setgrade(score, score1, score2);
		Std.getInfoStudent();

	}

}
class Student3 {
	public String idStu;

	public String nameStu;

	private int ageStu;

	private int score;

	private String gradeStu;
	
	public Student3(String id, String name, int age, int score, String grade) {
			idStu = id;
			nameStu = name;
			ageStu = age;
			this.score = score;
			gradeStu = grade;

	}

	public void getInfoStudent() {
		System.out.println("���� : " + idStu);
		System.out.println("���� : " + nameStu);
		System.out.println("����: " + ageStu);
		System.out.println("��ṹ  : " + gradeStu);

	}

	public void setInfo(String id, String name){
		idStu = id;
		nameStu = name;
	}
	public void setInfo(int age){
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


