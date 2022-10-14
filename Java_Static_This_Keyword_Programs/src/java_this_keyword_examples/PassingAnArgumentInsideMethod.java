package java_this_keyword_examples;

public class PassingAnArgumentInsideMethod {
	
	//method1
	void method1(PassingAnArgumentInsideMethod obj1) {
		System.out.println("Method is invoked");
	}
	void method2() {
		//this keyword can also be passed as an argument in the method
		method1(this);
	}
	public static void main(String[] args) {
		//creating object
		PassingAnArgumentInsideMethod obj1=new PassingAnArgumentInsideMethod();
		//Method calling
		obj1.method2();
	}
	
}
