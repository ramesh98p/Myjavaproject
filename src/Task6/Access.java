package Task6;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModiefier a=new AccessModiefier();
		//System.out.println(a.id);// we can't access private accessmodiefier
		System.out.println(a.name);//
		System.out.println(a.mobile);//we can access outside the class
		System.out.println(a.address);//
	}

}
