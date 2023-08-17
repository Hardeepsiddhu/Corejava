package in.com.batch;

public class Tring {

	public static void main(java.lang.String[] args) {
	String name = "vijay dinanath chauhan";
	
	
	System.out.println("String length = " + name.length());
	System.out.println("7th charracter is  = " + name.charAt(0));
	System.out.println("Dina index is = " + name.indexOf("dina"));
	System.out.println("First i position = " + name.indexOf("i"));
	System.out.println("last i position is ="+ name.lastIndexOf("i"));
	System.out.println("a is replaced by b = " +name.replace("j","u"));
	System.out.println("chota vijay=" + name.toLowerCase());
	System.out.println("bada vijay ="+name.toUpperCase());
	System.out.println("starts with vijay=" + name.startsWith("vijay"));
	System.out.println("ends with han = " + name.endsWith("han"));
	System.out.println("substring = " + name.substring(6));
	}

}
