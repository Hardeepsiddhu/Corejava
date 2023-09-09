package in.com.iohard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferreader1 {

	public static void main(String[] args) throws Exception {
	
		FileReader file = new FileReader("C:\\Users\\DELL\\Desktop\\ioread\\hardeep.txt");
		BufferedReader reader =new BufferedReader(file);
		
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
		file.close();
	}

}
