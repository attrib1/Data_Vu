package lab6;

import java.util.Scanner;

public class lab6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Square S = new Square();

		double[] data = new double[2];
		System.out.print("�кؤ������ҧ : ");
		data[0] = scan.nextDouble();
		System.out.print("�кؤ������ : ");
		data[1] = scan.nextDouble();

		S.setLength(data[0]);
		S.setWidth(data[1]);
		S.getArea();
	}

}

class Square {
	private double width;
	private double length;
	public double areaSquare;
	public double areaBorderLength;

	public void setWidth(double w) {
		width = w;

	}

	public void setLength(double l) {
		length = l;

	}

	public void getBorderLength() {
		areaBorderLength = (2 * width) + (2 * length);

	}

	public void getSquareArea() {
		areaSquare = width * length;

	}

	public void getArea() {
		getBorderLength();
		getSquareArea();
		System.out.println("��鹷���� : " + areaSquare);
		System.out.println("��鹷������ͺ�ٻ��� : " + areaBorderLength);
	}
}
