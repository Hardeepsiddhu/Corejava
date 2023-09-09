package in.com.iohard;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
	
public class Filewriter2 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\DELL\\Desktop\\ioread\\dipesh.txt");
		PrintWriter out = new PrintWriter(file);
		out.println("His name is dipesh ");
		out.println("fucking wierd man disgusting cheap men");
		file.close();
		out.close();
		System.out.println("data entry successfully");

	
	}

}
