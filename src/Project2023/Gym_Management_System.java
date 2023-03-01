package Project2023;

public class Gym_Management_System {
private String username="raj";
private String password="romy";

public void setUsername(String u) {
	username=u;
	System.out.println("username not valid");
}
public void setPassword(String p) {
	password=p;
	System.out.println("pass not valid");
}
public String getUsername()
{
	return username;
	
	
}
public String getPassword()
{
	return password;
}
}
