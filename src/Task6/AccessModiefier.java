package Task6;

import java.util.Scanner;

public class AccessModiefier//business logic class
{
	
	private int id=10;
	protected String name="hemant";
	public double mobile=5645453;
	String address="pune";

	
	private void product()//programer define method
	{
		System.out.println("Laptop");
	}
	protected void mobile()//programer define method
	{
		System.out.println("Display mobile details");
	}
	void laptop()//programer define method
	{
		System.out.println("Display laptop details");
	}

	public static void main(String[] args)
	{
		AccessModiefier a=new AccessModiefier();
		
		
		System.out.println(a.id);
		System.out.println(a.name);
		System.out.println(a.mobile);
		System.out.println(a.address);
		
		a.product();//private we can access inside the own class only
		a.mobile();//protected we can access inside the own class and access anothe class and we can access different package but another package we can access only subclass
		a.laptop();//default we can access inside the own package anywhere
		
	}
}

