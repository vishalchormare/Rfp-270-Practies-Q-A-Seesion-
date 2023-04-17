package practiesforoopsconcept;

class Steudnt{
	int rollnumber;
	String name;
	String subject;
	
	public Steudnt(int rollnumber,String name,String subject) {
		
		this.rollnumber=rollnumber;
		this.name=name;
		this.subject=subject;
		
	}
	
	void display() {
		System.out.println(rollnumber+name+subject);
	}
}
public class ThisKeyword {
	
	public static void main(String[] args) {
		Steudnt obj1= new Steudnt(1,"Vishal","Math");
		obj1.display();
		
	}

}
