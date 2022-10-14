package java_this_keyword_examples;

//Reusing the constructor example program
class Student1{
	int rollno;
	String college, name;
	float fee;
	
	//Constructor with some parameters
	Student1(int rollno,String college, String name){
		this.rollno=rollno;
		this.college=college;
		this.name=name;
	}
	//Constructor with full parameters
	Student1(int rollno,String college,String name, float fee){
		this(rollno,college,name);
		this.fee=fee;
	}
	//Creating method
	void details(){
		System.out.println(rollno+" "+college+" "+name+" "+fee);
	}
	
}

public class Constructor_Call_Using_This {
	public static void main(String[] args) {
		
		//Creating objects for the Student class
		Student1 obj1=new Student1(12,"Ravi","C++");
		Student1 obj2=new Student1(15,"Shiva","java",50000f);
		
		//Calling methods with the help of objects
		obj1.details();
		obj2.details();
	}

}
