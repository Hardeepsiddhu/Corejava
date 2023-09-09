package in.com.inheritance;

public class Testcust {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1 = new Customer("Hardeep");
		Customer c2 = (Customer) c1.clone();
		
	}

}
