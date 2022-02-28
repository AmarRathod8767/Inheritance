package Inheritance;

public class EmployeHierarchical extends HierarchicalAdmin {
	int salary;
	void accept1(int salary)
	{
	 this.salary=salary;
	 
	}
	void display1()
	{
		System.out.println("Salary: "+salary);
	}


}
