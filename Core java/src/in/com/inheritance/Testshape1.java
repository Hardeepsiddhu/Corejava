package in.com.inheritance;

public class Testshape1 {

	public static void main(String[] args) {
		Shape1 [] s= new Shape1[3];
		s[0] = new Rect();
		s[1] = new Circle();
		s[2] = new Triangle();
		 
		Rect r = (Rect) s[0];
		r.setLength(10);
		r.setWidth(12);
		//r.area();
		Circle c = (Circle) s[1];
		c.setRadius(10);
		//c.area();
	    Triangle t = (Triangle) s[2];
	    t.setHeight(10);
	    t.setBase(8);
	   // t.area();
	

	    for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}
	    	}
}
	    


