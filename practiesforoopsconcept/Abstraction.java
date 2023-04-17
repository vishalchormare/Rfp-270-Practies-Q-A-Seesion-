package practiesforoopsconcept;

interface Calculeter {

	void Calculate(int x, int y);
}

class Additon implements Calculeter {

	@Override
	public void Calculate(int x, int y) {
		int z = x + y;

		System.out.println("Additon is " + " " + z);
	}

}

class Multiplication implements Calculeter {

	@Override
	public void Calculate(int x, int y) {

		int z = x * y;

		System.out.println("Multipication is " + " " + z);
	}

}

public class Abstraction {

	/*
	 * abstraction hiding impleamtion show some details two types of abstraction
	 * 1)interface 2)Abstrac Class
	 */

	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();
		multiplication.Calculate(2, 6);

		Additon additon = new Additon();
		additon.Calculate(5, 6);
	}

}
