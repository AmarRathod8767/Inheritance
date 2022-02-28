package Inheritance;

public class Company {

	public static void main(String[] args) {
		Manager obj1=new Manager();
		obj1.accept("Shiva");
		obj1.accept1("Rahul",202,25000);
		obj1.display();
		obj1.display1();
		Devloper obj=new Devloper();
		obj.accept("Third Eye");
		obj.display();
		obj.accept1("Nitin",201,20000);
		obj.display1();
		obj.accept2("IT");
		obj.display2();

	}

}
