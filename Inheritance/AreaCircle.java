package Inheritance;

public class AreaCircle {
	int a;
	double area;
	void accept(int a)
	{
		this.a=a;
	}
	void circle()
	{
		area=3.14*(a*a);
	}
	void display()
	{
	System.out.println(area);
	
	}

}
