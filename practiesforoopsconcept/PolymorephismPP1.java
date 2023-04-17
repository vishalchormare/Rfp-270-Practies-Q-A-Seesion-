package practiesforoopsconcept;

class SumofNumber {

	void Additon(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
}

class MultipleofNumber extends SumofNumber {

	@Override
	void Additon(int x, int y) {
		int z = x * y;
		System.out.println(z);
	}
}

public class PolymorephismPP1 {

	/*
	 * 
	 * Runtime Polymoresphism means overriding in case my parent class in
	 * implimention not statificed so can i use the overrriding overriding menas
	 * same method name and same arugment of number
	 */

	public static void main(String[] args) {

		MultipleofNumber multipleofNumber = new MultipleofNumber();
		multipleofNumber.Additon(85, 65);

	}

}
