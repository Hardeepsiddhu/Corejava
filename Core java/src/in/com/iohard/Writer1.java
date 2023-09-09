package in.com.iohard;

import java.io.FileWriter;

public class Writer1 {

	public static void main(String[] args) throws Exception{
	
	FileWriter writer = new FileWriter("C:\\Users\\DELL\\Desktop\\ioread\\arsh.txt");
	writer.write("helloo i am arshh from rays technology");
	writer.write("finally placed at cognizant in package of 12lac");
	writer.write("yess i do it!");
	writer.close();
	System.out.println(" Data entry successfully");
	}

}
