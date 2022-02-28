package Inheritance;

public class Main{

	public static void main(String[] args) {
		Add obj=new Add();
		obj.accept(20,30);
		obj.add();
		obj.display();
		
		Sub obj1=new Sub();
		obj1.accept(300,200);
		obj1.sub();
		obj1.display();
		

	}

}
