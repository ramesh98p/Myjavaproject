package Constructor;

import java.util.Scanner;

public class Student {
	int sid;
	String sname;
	double percentage;
	

	Student(int id,String name,double per) {
		sid=id;
		sname=name;
		percentage=per;
	}
	void display()
	{
		System.out.println(sid+" "+sname+" "+percentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
//Student s1=new Student(101, "raj", 90);
System.out.println("enter id");
int id=sc1.nextInt();
System.out.println("Enter the name");
String name=sc1.next();
System.out.println("Enter the per");
double per=sc1.nextDouble();
Student s1=new Student(id,name,per);
s1.display();


	}

}
