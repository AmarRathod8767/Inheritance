package Inheritance;

public class BillNext extends Bill {
	void billA()
	{
		total=qty*price;
		total=total+(total*18/100);
	}

	public static void main(String[] args) {
		BillNext obj=new BillNext();
		obj.accept("Laptop",2,25000);
		obj.billA();
		obj.display();
		

	}

}
