package java_this_keyword_examples;

class Fruit{
	String name,color;
	float price;
	int quantity;
	
	//Parameterized constructor
	Fruit(String name, String color, float price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	//Adding extra parameter to the parameterized constructor
	Fruit(String name, String color, float price,int quantity){
		this(name,color,price);//it gives you compile time Error
		this.quantity=quantity;//If you interchange these two lines you will get error
		
	}
	void buyFruits() {
		System.out.println(name+" "+color+" "+price+" "+quantity);
	}
}


public class CompileTimeError_With_ThisKeyword {
	public static void main(String[] args) {
		Fruit obj1=new Fruit("Mango", "Yellow", 3000);
		Fruit obj2=new Fruit("Apple","Red",300,3);
		obj1.buyFruits();
		obj2.buyFruits();
	}
}
