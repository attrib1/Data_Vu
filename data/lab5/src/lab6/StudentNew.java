package lab6;


public class StudentNew {
	private String Id;
	private String Name;
	private float Gpa;
	
	public void setID(){
		Id="56120028";
	}
	public void setName(){
		Name="Thanawut";
	}
	public void setGpa(){
		Gpa=2.50f;
	}
	public String getName() {
		return Name;
	}
	public String getId() {
		return Id;
	}
	public float getGpa() {
		return Gpa;	
	}
	public void showData() {
		System.out.println("ID ="+Id);
		System.out.println("Name ="+Name);
		System.out.println("GPA ="+Gpa);
	}
}

class StudentDemo{
	public static void main(String[] asgs) {
		StudentNew stu1=new StudentNew();
		StudentNew stu2=new StudentNew();
		
		stu1.setID();
		stu1.setName();
		stu1.setGpa();
		stu1.showData();
		stu2.showData();
		
		StudentNam stu3 =new StudentNam("56120028","Thanawut",2.5f);
		stu3.showData();
	}
}
class StudentNam {
	private String Id;
	private String Name;
	private float Gpa;
	
	public StudentNam (String id,String name,float gpa) {
		Id=id;
		Name=name;
		Gpa=gpa;
	}
	public String getName() {
		return Name;
	}
	public String getId() {
		return Id;
	}
	public float getGpa() {
		return Gpa;	
	}
	public void showData() {
		System.out.println("ID ="+Id);
		System.out.println("Name ="+Name);
		System.out.println("GPA ="+Gpa);
	}
}
