package in.com.inheritance;

	public class Customer implements Cloneable {
		public String name = null;
		public Deepclone a =null;
		
		 public Customer (String name) {
			 this.name=name;
			 this.a=new Deepclone(50000);
		 }
		@Override
		protected Object clone() throws CloneNotSupportedException {
			Customer c = (Customer) super.clone();
			a= (Deepclone) a.clone();
			return c;
		} 
}
