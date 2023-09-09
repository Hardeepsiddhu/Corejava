package in.com.iohard;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Testserilzation {
public static void main(String[] args)  throws Exception{
	FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\ioread\\obj.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	Employeee e = new Employeee();
	e.empId = 1;
	e.name="hardeep";
	e.salary =150000;
	e.bonus = 2000;
	e.total = e.salary+e.bonus;
	out.writeObject(e);
	file.close();
	out.close();
	System.out.println("obj converted into Stream");
	
}
}
