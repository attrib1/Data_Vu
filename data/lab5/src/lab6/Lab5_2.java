package lab6;

import java.util.Scanner;

public class Lab5_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle rec = new Rectangle(0,0);
		
		System.out.print("Width : ");
			float width = scan.nextFloat();
		System.out.print("Length : ");
			float Length = scan.nextFloat();
			
		//set data
			rec.getWidth(width);
			rec.getLength(Length);
		//Show data
			rec.getArea();
	}

}

class Rectangle {
	private float width;
	private float length;

	public Rectangle(int w, int l){
		width = w;
		length = l;
		
	}

	public void getWidth(float width) {
		this.width = width;

	}

	public void getLength(float length) {
		this.length = length;

	}

	public  void getArea(){
		float total = width*length;
		
		
		System.out.println("พื้นที่คือ : "+total);

	}
}
