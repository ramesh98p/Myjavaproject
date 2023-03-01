package Task4;

public class Car {
	int cId;
	String cname;
	double price;
	String color;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car type=new Car();
 type.cId=101;
 type.cname="Baleno";
 type.price=70000;
 type.color="white";
 
 System.out.println(type.cId+" "+type.cname+" "+type.price+" "+type.color);
 Car type2=new Car();
 type2.cId=201;
 type2.cname="Briza";
 type2.price=90000;
 type2.color="Read";
 System.out.println(type2.cId+" "+type2.cname+" "+type2.price+" "+type2.color);
 Car type3=new Car();
 type3.cId=205;
 type3.cname="Tavera";
 type3.price=50000;
 type3.color="Blue";
 System.out.println(type3.cId+" "+type3.cname+" "+type3.price+" "+type3.color);
	}

}
