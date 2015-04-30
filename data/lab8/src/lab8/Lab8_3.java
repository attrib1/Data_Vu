package lab8;

public class Lab8_3 {

	public static void main(String[] args) {
		
		 new Rectangle("ผืนผ้า", 5,8);
	}

}
class Rectangle{
	public Rectangle(String name,int w) {
		System.out.println("ประเภทสี่เหลี่ยม = "+name);
		System.out.println("ความกว้างของสี่เหลี่ยม = "+w);
		System.out.println("พื้นที่สี่เหลี่ยม  = "+(w*w));
		
	}
	public Rectangle(String name , int w,int l) {
		this("จัตุรัส",5);
		System.out.println("ประเภทสี่เหลี่ยม = "+name);
		System.out.println("ความกว้างสี่เหลี่ยม = "+w);
		System.out.println("ความยาวของสี่เหลี่ยม = "+l);
		System.out.println("พื้นที่สี่เหลี่ยม  = "+(w*l));
		
	}
}
