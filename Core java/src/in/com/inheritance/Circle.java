package in.com.inheritance;

public class Circle extends Shape1{
	private int radius = 0;
	private double PI =3.14;
	
	 public void setRadius(int radius) {
		 this.radius=radius;
	 }
	 public int getRadius() {
		 return radius;
	 }
	 public double area() {
		 double carea = PI*getRadius()*getRadius();
		 System.out.println("circle area =" +carea);
		return carea;
	 }

}
