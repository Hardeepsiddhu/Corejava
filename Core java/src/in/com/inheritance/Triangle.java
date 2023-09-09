package in.com.inheritance;

public class Triangle extends Shape1{
	private int height =0;
	private int base = 0;
	
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public void setBase(int base) {
		this.base=base;
	}
	public int getBase() {
		return base;
	}
	public double area() {
		int tarea = getHeight()*getBase();
		System.out.println("triangle area = " + tarea);
		return tarea;

}
}
