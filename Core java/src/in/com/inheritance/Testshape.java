package in.com.inheritance;

public class Testshape {

	public static void main(String[] args) {
		Rect r = new Rect();
		r.setBorderwidth(10);
		r.setColor("baby pink");
		r.setLength(15);
		r.setWidth(20);
		r.area();
		
		
		Shape1 s = new Shape1();
		Rect r1 = (Rect) s;
		r1.setBorderwidth(15);
		

	}

}
