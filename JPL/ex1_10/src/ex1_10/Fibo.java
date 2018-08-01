package ex1_10;

public class Fibo {
	
	int val;
	Boolean even;
	
	Fibo(){
		this.val = 0;
		this.even = false;
	}
	
	public void IsEven() {
		if(this.val%2==0) {
			this.even = true;
		}
	}
	
}
