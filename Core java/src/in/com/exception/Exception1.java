
package in.com.exception;

public class Exception1 {
 public static void main(String[] args) {
	int a = 10;
	int b = 5;
	System.out.println("main method start");
	 try {
		int c =a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
	 System.out.println("main method end");
}
}
