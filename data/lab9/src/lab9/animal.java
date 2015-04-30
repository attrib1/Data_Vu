package lab9;

public class animal {
	public static void main(String[] args) {
		dog d = new dog();
		mumo m = new mumo();
		System.out.println("Show Detail Mumo :");
		System.out.println("Mumo can : "+m.run());
		System.out.println("Mumo can  : "+m.jump());
		System.out.println("Mumo can  : "+m.sit());
		
		System.out.println("Mumo can  "+m.count()+" number");
		System.out.println("Mumo color's : "+m.color());
	}
}
class dog {
	
	public String run() {
		
		return "run";
	}

	public String jump() {
		return "jump";
	}

	public String sit() {
		return "sit";
	}
}

class mumo extends dog {
	public String count() {
		return "count";

	}
	public String color() {
		return "blue";
	}
}
