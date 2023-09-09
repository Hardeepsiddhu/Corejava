package in.com.batch;

public class Testshape {

	public static void main(String[] args) {
		Shape s = new Shape(20,"black");
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		
		s.setBorderWidth(60);
		s.setColor("dark blue");
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}

}
