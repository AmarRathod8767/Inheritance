package Inheritance;

public class Devloper extends Manager {
	private String techno;
	void accept2(String techno)
	{
		this.techno=techno;
	}
	void display2()
	{
		System.out.println("Technology Name: "+techno);
	}

}
