package lab8;

public class Lab8_3 {

	public static void main(String[] args) {
		
		 new Rectangle("�׹���", 5,8);
	}

}
class Rectangle{
	public Rectangle(String name,int w) {
		System.out.println("���������������� = "+name);
		System.out.println("�������ҧ�ͧ���������� = "+w);
		System.out.println("��鹷������������  = "+(w*w));
		
	}
	public Rectangle(String name , int w,int l) {
		this("�ѵ����",5);
		System.out.println("���������������� = "+name);
		System.out.println("�������ҧ���������� = "+w);
		System.out.println("������Ǣͧ���������� = "+l);
		System.out.println("��鹷������������  = "+(w*l));
		
	}
}
