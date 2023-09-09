package in.com.inheritance;

	public class Deepclone implements Cloneable {
		public double balance =0;
		public Deepclone(double balance) {
			
			this.balance = balance;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
		
			return super.clone();
		}
}
