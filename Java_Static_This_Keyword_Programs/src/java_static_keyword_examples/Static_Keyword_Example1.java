package java_static_keyword_examples;

class Student{
	//instance variable
		int rollno;
		String name;
		static String college="JNTUH";//static variable
		
		//constructor
		Student(int r, String n){
			rollno=r;
			name=n;
		}
		
		//Method to display values
		void display() {
			System.out.println(rollno+" "+name+" "+college);
		}
		
}

//Test class to show the values of objects
public class Static_Keyword_Example1 {
	public static void main(String[] args) {
		Student obj1=new Student(10,"Jack");
		Student obj2=new Student(11,"Aryan");
		
		//We can change the college of all objects by the single line of code
		obj1.display();
		obj2.display();
	}
	
}
