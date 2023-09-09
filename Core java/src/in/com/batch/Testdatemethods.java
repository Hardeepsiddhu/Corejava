package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testdatemethods {
public static void main(String[] args) throws ParseException {
	
	String str ="03/12/2001";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Datemethods d =new Datemethods();
	d.setName("hardeep");
	d.setId(2001);
	d.setDob(sdf.parse(str));
	System.out.println(d.getName());
	System.out.println(d.getId());
	System.out.println(d.getDob());
}
}
