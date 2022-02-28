package Inheritance;

public class Bill {
	String iteam;
	int qty;
	float price;
	float total;
	void accept(String iteam,int qty,int price)
	{
		this.iteam=iteam;
		this.qty=qty;
		this.price=price;
		
		
	}
	void billA()
	{
		total=price*qty;
	}
	void display()
	{
		System.out.println("Tatal: "+total);
	}

}
