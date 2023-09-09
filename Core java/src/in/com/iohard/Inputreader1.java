package in.com.iohard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Inputreader1  {
public static void main(String[] args) throws Exception{
	InputStreamReader isreader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isreader);
	PrintWriter out = new PrintWriter("C:\\Users\\DELL\\Desktop\\ioread\\sagar.txt");
	String line =in.readLine();
	while(!(line.equals("bye"))) {
		out.println(line);
		line = in.readLine();
		}
	in.close();
	out.close();
	isreader.close();
}
}
