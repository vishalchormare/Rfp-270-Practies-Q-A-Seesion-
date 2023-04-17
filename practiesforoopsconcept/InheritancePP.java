package practiesforoopsconcept;

/*
Five types are inheritance 
What is inheritance . Inheritance is is a Relationship 
inheritance means Praent class ke propites chidl class mai access kr sakte hai by using exteds keyword
inhertiance have five types
1) Single inheritance 
2) Multiple Inheritance
3) Multilevel Inheritance
4) Harichical Inheritance 
5) Haybrid Inheritance

*/

class Adivison {

	void nameOfStudentA() {
		System.out.println("RAhil , vishal of Divison A");
	}
}

//single inheritance
class Bdivison extends Adivison {

	void nameofStudentB() {
		System.out.println("Rajesh , Kavita of Divison B");
	}
}

//multi-level
class Cdivison extends Bdivison {

	void nameofStudentC() {
		System.out.println("Rajesh , Kavita of Divison C");
	}
}

public class InheritancePP {

	public static void main(String[] args) {

		Adivison adivison = new Adivison();
		adivison.nameOfStudentA();;
		
		Bdivison bdivison = new Bdivison();
		bdivison.nameOfStudentA();
		bdivison.nameofStudentB();
		
		Cdivison cdivison = new Cdivison();
		cdivison.nameOfStudentA();
		cdivison.nameofStudentB();
		cdivison.nameofStudentC();
	}
}
