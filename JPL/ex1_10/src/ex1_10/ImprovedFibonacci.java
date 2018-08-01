package ex1_10;

public class ImprovedFibonacci {
	static final int MAX_INDEX = 9;
	/** 
	 * 偶数要素に'*'を付けて、フィボナッチ数列の
	 * 最初の方の要素を表示する  */
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		String mark;
		Fibo[] fibo = new Fibo[MAX_INDEX];
		
		fibo[0] = new Fibo();
		fibo[0].val = 1;
		fibo[0].IsEven();
		fibo[1] = new Fibo();
		fibo[1].val = 1;
		fibo[1].IsEven();
		
		for(int i=2;i<MAX_INDEX;i++) {
			hi = hi + lo;
			lo = hi - lo;
			fibo[i] = new Fibo();
			fibo[i].val = hi;
			fibo[i].IsEven();
		}
		
		for(int i=0;i<MAX_INDEX;i++) {
			if(fibo[i].even)
				mark = " *";
			else
				mark = "";
			System.out.println(i+1 + ": " + fibo[i].val + mark);
		}
		
		
	}
}
