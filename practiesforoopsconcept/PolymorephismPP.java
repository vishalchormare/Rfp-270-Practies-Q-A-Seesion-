package practiesforoopsconcept;

public class PolymorephismPP {

	/*
	 * PolyMorePhism ploy means many and more form Single action in difference ways
	 * polymoresphims are two types 1) Compile time polymorephism 2) Run time
	 * polymorephism
	 * 
	 * 
	 * Compile time means overloading means same method but different argument of
	 * number
	 */

	void NumberAddtion() {
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);

	}

	void NumberAddtion(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		PolymorephismPP polymorephismPP = new PolymorephismPP();
		polymorephismPP.NumberAddtion();
		polymorephismPP.NumberAddtion(50, 10);
	}
}
