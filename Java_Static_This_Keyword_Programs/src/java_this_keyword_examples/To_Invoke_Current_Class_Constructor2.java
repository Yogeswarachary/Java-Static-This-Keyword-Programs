package java_this_keyword_examples;

//Calling parameterized constructor from default constructor
class Bcls{  
	//default constructor
	Bcls(){ 
		//Act like a parameterized constructor
		this(25);  
		System.out.println("hello Bclass");  
	}  
	//Passing parameter to the parameterized constructor
	Bcls(int x){  
		System.out.println(x);  
	}  
}  
public class To_Invoke_Current_Class_Constructor2 {
	public static void main(String[] args) {
		
		//Creating object for the Bcls/Bclass
		Bcls obj=new Bcls();
	}
}
