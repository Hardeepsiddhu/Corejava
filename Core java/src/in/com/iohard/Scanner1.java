package in.com.iohard;


import java.io.FileReader;
import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\DELL\\Desktop\\ioread\\hardeep.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext());{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
