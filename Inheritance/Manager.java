package Inheritance;

public class Manager extends Admin{
	private String name;
	private int id;
	private int salary;
	void accept1(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	void display1()
	{
		System.out.println("Name: "+name+"\nId: "+id+"\nSalary: "+salary);
	}

}
