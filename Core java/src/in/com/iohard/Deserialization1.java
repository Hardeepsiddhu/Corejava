package in.com.iohard;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization1 {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\ioread\\obj.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		Employeee e = (Employeee) in.readObject();
		
		System.out.println("EMPID =" + e.empId);
		System.out.println("Name =" + e.name);
		System.out.println("Salary =" + e.salary);
		System.out.println("Bonus =" + e.bonus);
		System.out.println("Total =" + e.total);
		
		file.close();
		in.close();
		
	}
}
