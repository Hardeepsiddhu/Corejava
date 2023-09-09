package in.com.inheritance;

public class Shalloclone implements Cloneable{
	
		int balance;
		public Shalloclone(){

		}
		public Shalloclone (int balance) {
		this.balance= balance;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}
	}



