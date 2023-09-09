package in.com.inheritance;

public class Testshallo {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Shalloclone a = new Shalloclone(10000);
		System.out.println(a.balance);
		Shalloclone a1 = (Shalloclone) a.clone();
		a1.balance = 76880;
		System.out.println(a1.balance);
	}
}
