package Inheritance;

public class SingleMain extends Singel {
	private String name;
	private int id;
	private int sal;
	void accept1(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		
	}
	void display1()
	{
		System.out.println("Name: "+name+"\nid: "+id+"\nsalary: "+sal);
		
	}
	public static void main(String[]args)
	{
		SingleMain obj=new SingleMain();
		obj.accept("Shiva Concept Solution");
		obj.display();
		obj.accept1("Shiva",101,20000);
		obj.display1();
		
		
	}
	
	

}
