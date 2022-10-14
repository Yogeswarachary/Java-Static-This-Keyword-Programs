package java_this_keyword_examples;

//Calling default constructor from parameterized constructor
class Acls{
	//No arguments constructor/Default constructor
	Acls(){
		System.out.println("Hello Aclass");
	}
	//Parameterized constructor
	Acls(int a){
		this();//It is act like default constructor
		System.out.println(a);
	}
}
public class To_Invoke_Current_Class_Constructor1 {
	public static void main(String[] args) {
		Acls obj=new Acls(20);
	}
}
