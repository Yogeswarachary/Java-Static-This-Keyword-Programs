package java_static_keyword_examples;

//1.create student class
class Bike{
	int bikecc;
	String modelName;
	long cost;
	static String company="Hero";
	
	//2.create parameterized constructor
	Bike(int cc,String mn,long c){
		bikecc=cc;
		modelName=mn;
		cost=c;
	}
	//3.create method
	void bikeDetails() {
		System.out.println(bikecc+" "+modelName+" "+cost+" "+company);
	}
	
}

public class Static_Example2 {
	public static void main(String[] args) {
		
		//4.Create a another class and inside that create object for first class
		Bike obj1=new Bike(200, "XPulse", 120000);
		Bike obj2=new Bike(350, "Xpulse", 230000);
		
		//5.call the method for the created object
		obj1.bikeDetails();
		obj2.bikeDetails();
	}
	
	

}
