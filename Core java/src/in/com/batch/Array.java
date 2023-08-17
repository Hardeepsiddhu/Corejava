package in.com.batch;

public class Array {
	public static void main(String[] args) {
	/*	int [] arr = {10,20,30,40,50};
		for(int i: arr) {
			System.out.println(i);
		} */
		
		// string array
	/*	String [] name = {"hardeep ", "dipesh","shubham","gopal"};
		for(String a: name) {
			System.out.println(a);
		}   */
		
		
		//String  name = "vijay dinanath chouhan";
	//	System.out.println("7th char is ="+ name.charAt(6));
		
	 // array findout greatest number
		
		int [] arr = {10,20,56,98,58,54};
		int a = 0;
		for(int i =0;i<arr.length;i++){
		if (arr[i] > a ){
		a = arr[i];
			}
	}
		System.out.println(a);
	}
}
