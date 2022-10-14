package java_this_keyword_examples;

class Aclass{
	void method1() {
		System.out.println("Hello from method 1");
	}
	void method2() {
		System.out.println("Hello from method 2");
		method1();
	}
	
}

public class Invoking_Method_This_Keyword {
	public static void main(String[] args) {
		Aclass obj=new Aclass();
		obj.method2();
		obj.method1();
	}
}
