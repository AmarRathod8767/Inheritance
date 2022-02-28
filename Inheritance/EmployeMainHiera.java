package Inheritance;

public class EmployeMainHiera {

	public static void main(String[] args) {
		System.out.println("Employee info");
		EmployeHierarchical obj=new EmployeHierarchical();
        obj.accept(1001,"Narendra Modi");
        obj.accept1(20000);
        obj.display();
        obj.display1();
        
        HierarchicalAdmin obj1=new HierarchicalAdmin();
        obj1.accept(1001,"Amit Shah");
        obj1.display();
        
        
	}

}
