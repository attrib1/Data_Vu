package lab7;

import java.util.Scanner;

public class Student1Static {
	public static  String idStu;
	public static String nameStu;
	private static int ageStu;
	private static int score;
	
	private static String gradeStu;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
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
		
		setID(idStu);
		setName(nameStu);
		setAge(ageStu);
		setgrade(score,score1,score2);		
		getInfoStudent();
			
		

	}

	public static void getInfoStudent() {
		System.out.println("���� : "+idStu);
		System.out.println("���� : "+nameStu);
		System.out.println("����: "+ageStu);
		System.out.println("��ṹ  : "+gradeStu);
	}

	public static void setID(String id) {
		idStu = id;

	}

	public static void setName(String name) {
		nameStu = name;

	}

	public static void setAge(int age) {
		ageStu = age;

	}

	public static void setgrade(int quiz, int mid, int finalTest) {
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
