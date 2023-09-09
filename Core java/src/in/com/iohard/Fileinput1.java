package in.com.iohard;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class Fileinput1 {
	public static void main(String[] args) throws Exception {
		
	
	FileInputStream in = new FileInputStream("C:\\Users\\DELL\\Desktop\\ioread\\pic.jpg.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\DELL\\Desktop\\ioread\\shivam.jpg");
	int ch = in.read();
	while(ch != -1) {
		out.write(ch);
		ch = in.read();
	}
	in.close();
	out.close();
	System.out.println("data  enter succefully");
	}
}
