package Inheritance;

public class Admin {
	private String cname;
	void accept(String cname)
	{
		this.cname=cname;
		
	}
	void display()
	{
		System.out.println("Company name: "+cname);
		
	} 

}
