package Assigment3;

public class Student {
	
	int sid;
	String sname;
	
	
	void accessDetails(int id,String name)
	{
		sid=id;
		sname=name;
		
	}
	void show()
	{
		System.out.println("Display student id=="+sid);
		System.out.println("Display student name=="+sname);
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.accessDetails(101,"hemant");
		s1.show();
		
		
		Student s2=new Student();
		s2.accessDetails(201, "sachin");
		s2.show();
		

	}

}
