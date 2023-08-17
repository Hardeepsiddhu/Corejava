package in.com.batch;

public class Opmethod1 {
	public void Sum(int a, int b , int c) {
		int e = a+b+c;
		System.out.println(e);
	}
	
	public void mult(int a ,int b) {
		int c = a+ b;
		System.out.println(c);
	}
	public void notecount(int number) {
		int [] note = {2000,500,200,100,50,10,12};
		int count = 0;
		for (int i = 0; i < note.length; i++) {
			count = number / note[i];
			if(count >0) {
				System.out.println(note[i]+ "=" + count);
 		}
			number =  number % note[i]; 
		}
		
		}
	public void largest(int [] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max= arr[i];
			}
		}
		System.out.println("max=" + max);
	}
	
public static void main(String[] args) {
	int [] arr = {100,200,500,300};
	Opmethod1 d =  new Opmethod1();
	d.Sum(10, 15, 20);
	d.mult(10, 20);
	d.notecount(75010);
	d.largest(arr);
}
}
