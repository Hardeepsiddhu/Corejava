package in.com.batch;

public class Setgett {
private String name = null;
private String address = null;
private String dob = null;


public String getName() {
	return name;
}
public void setName(String n) {
	name= n;
}
public String getAddress() {
	return address;
}
public void setAddress(String a) {
	address =  a;
}
public String getDob() {
	return dob;
}
public void setDob(String d) {
	dob = d;
}


public static void main(String[] args) {
	
	Setgett s =  new Setgett();
	Setgett s1= new Setgett();
	
	
	s.setName("hardeep");
	s.setAddress("indore");
	s.setDob("03/12/2001");
	
	s1.setName("gopal");
	s1.setAddress("indore");
	s1.setDob("14/08/1999");
	
	System.out.println("name:" + s.getName());
	System.out.println("address:" + s.getAddress());
	System.out.println("dob:" + s.getDob());
	System.out.println(s1.getName());
	
	
	System.out.println("name:" + s1.getName());
	System.out.println("address:" + s1.getAddress());
	System.out.println("dob:" + s1.getDob());
	
}
	
	
}


