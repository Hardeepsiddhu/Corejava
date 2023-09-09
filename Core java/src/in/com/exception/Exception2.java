package in.com.exception;

public class Exception2 {
	public static void main(String[] args) {
		String name ="hardeep singh";
		System.out.println(name.length());
		try {
			System.out.println(name.charAt(10));
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
