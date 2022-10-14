package java_this_keyword_examples;

//create class
class Student{
	int rollno;
	String name;
	static String college="Abit";
	
	//create a constructor
	Student(int r,String n){
		this.rollno=r;
		this.name=n;
	}
	//Creating a method
	void Details() {
		System.out.println(rollno+" "+name+" "+college);
	}
}

//Creating another class
public class Basic_Static_Example1 {
	public static void main(String[] args) {
		//Creating the object for outer class
		Student obj1=new Student(1,"Raghava");
		Student obj2=new Student(2,"Veer singh");
		
		//calling a method
		obj1.Details();
		obj2.Details();
	}
}
