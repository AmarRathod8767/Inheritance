package Inheritance;

public class HierarchicalAdmin {
	int aid;
	String aname;
	void accept(int aid,String aname)
	{
	 this.aid=aid;
	 this.aname=aname;
	 
	 
	}
	void display()
	{
		System.out.println("ID: "+aid+"\nName: "+aname);
	}

}
