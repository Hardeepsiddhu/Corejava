package in.com.batch;

public class Typecasting {
	public static void main(String[] args) {
	//	byte b = 100;
		//double d = b;
		// System.out.println(d);
		
		// if chote se bade me change krenge toh implicit use krnge
		// or if bade se chote change krnge toh explicit use krnge
		// implicit 
		short dipesh = 20;
		long l =  dipesh;
		System.out.println(l);
		// explicit 
		double d =  100.00;
		byte b = (byte) d;
		System.out.println(b);
	}

}
