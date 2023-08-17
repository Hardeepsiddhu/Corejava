package in.com.batch;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	public static void main (String []args) throws ParseException {
  /*	Date date = new Date();
	System.out.println(date);  */
		
		
		//string to date
	/*	Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(date);
		System.out.println(str);*/
		
		
		
		// date to string
		
		String str = "11/08/2022";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date =  sdf.parse(str);
		System.out.println(date);
		
	}

}
