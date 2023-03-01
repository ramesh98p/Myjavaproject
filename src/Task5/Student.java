package Task5;

import java.util.Scanner;

public class Student {
	int sid;
	String sname;
	int physics;
	int chemistry;
	int math;
	int mark;
	int per;
	
	public void acceptDetails(int id,String name,int p,int c,int m)
	{
		sid=id;
		sname=name;
		physics=p;
		chemistry=c;
		math=m;
		
		
	}
	public void calculate(int p,int c,int m)
	
	{
	mark=p+c+m;
	per=mark/3;
		
		
		
		
		
	}
	
	public void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(physics);
		System.out.println(chemistry);
		System.out.println(math);
		
	}
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		
		Student s1=new Student();
		System.out.println("Enter the Student Id");
		int id=sc1.nextInt();
		System.out.println("Enter the Student name");
		String name=sc1.next();
		System.out.println("Enter the physics mark");
		int p=sc1.nextInt();
		System.out.println("Enter the chemistry");
		int c=sc1.nextInt();
		System.out.println("Enter the math");
		int m=sc1.nextInt();
		s1.acceptDetails(id, name, p, c, m);
		s1.calculate(p, c, m);
		System.out.println(s1.mark);
		System.out.println(s1.per);
		
		
		s1.display();
	}
	
	}


