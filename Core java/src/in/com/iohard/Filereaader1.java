package in.com.iohard;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Filereaader1 {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:\\Users\\DELL\\Desktop\\ioread\\hardeep.txt");	
		int ch = reader.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch = reader.read();
		}
		reader.close();
	}
}
