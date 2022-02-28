package Inheritance;

public class AreaMain {

	public static void main(String[] args) {
		AreaCircle c=new AreaCircle();
		c.accept(10);
		c.circle();
		c.display();
		
		AreaTri t=new AreaTri();
		t.accept1(5);
		t.accept(30);
		
		t.tri();
		t.display();
		
		AreaRact r=new AreaRact();
		r.accept1(50);
		r.accept(20);
		r.circle();
		r.display();

	}

}
