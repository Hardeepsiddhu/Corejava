package in.com.inheritance;

public class Shape1 {
	private String color=null;
	private int borderwidth=0;
	
	public void setColor(String color) {
		this.color= color;
	}
	public String getColor() {
		return color;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth=borderwidth;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public double area() {
		System.out.println("this is area method");
		return area();
	}
}	