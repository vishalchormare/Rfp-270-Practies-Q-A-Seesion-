package practiesforoopsconcept;



class Car{
	String color;
	Engine engine;
	String model;
}

class Engine {
	
	String engineType;

	
}



public class Association {	
	/*
	 
	 association has a relationship
	 the two type of Association 
	 1) Compostion asssocitaiton
	 2) aggreation Assocition
	 */
	
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		
		engine.engineType="Petrol";
		
		
		Car carl= new Car();
		carl.color="Red";
		carl.engine=engine;
		carl.model="BWM";
		
		System.out.println(carl.color);
		System.out.println(carl.model);
		System.out.println(carl.engine.engineType);
		
	}
	
}
