package AccessModifier1;
import Task6.AccessModiefier;



public class Access1 extends AccessModiefier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a=new Access1();
		//System.out.println(a.id); //we can,t access private accessmodifirs anothe class and anothe package
		System.out.println(a.name);// protected we can access anothe package but only subclass
		System.out.println(a.mobile); //public we can access any where as well as same class another class and another package
		//System.out.println(a.address); //default we can,t another package // we can access only own package
	}

}
