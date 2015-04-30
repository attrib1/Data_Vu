package Grade;

public class Student {
	public String Id;
	public String name;
	public double total;
	public String grade;
	public String subject;
	public Student(String id, String name, double total, String grade, String subject) {
		super();
		this.Id = id;
		this.subject = subject;
		this.name = name;
		this.total = total;
		this.grade = grade;
	}
	public void calStudent(double finaltest){
		total = finaltest;
		setGrade(total);
		
	}//Overloading Method
	public void calStudent(double finaltest, double mid , double hw){
		total = finaltest+mid+hw;
		setGrade(total);
		
	}//Overloading Method
	public void calStudent(double finaltest, double mid , double hw,double quiz){
		total = finaltest+mid+hw+quiz;
		setGrade(total);
		
	}//Overloading Method
	public void setGrade(double total){
		if(total >= 80) grade = "A";
		else if (total >= 70) grade="B";
		else if (total >= 60) grade="C";
		else if (total >= 50) grade="D";
		else grade = "F";
	}
	
}
