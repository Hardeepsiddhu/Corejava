package in.com.batch;

public class Factorialnumber {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		while(a<=10) {
			b=a*b;
			a++;
		}
		System.out.println(b);
	}

}
