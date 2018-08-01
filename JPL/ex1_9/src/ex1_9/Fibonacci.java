package ex1_9;

/** 
 * 配列のサイズが決め打ち
 * 時間があるときに指定の最大値から逆算して配列のサイズを求める関数作りたい
*/
public class Fibonacci {
	
	private static final String text = "フィボナッチ数列";
	private static final int num = 9;
	
	/** MAX未満であるフィボナッチ数列を表示する */
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		int[] fib = new int[num];
		fib[0] = lo;
		fib[1] = hi;
		
		System.out.println(text);
		for(int i=2;i<num;i++) {
			hi = hi + lo;
			lo = hi - lo;
			fib[i]   = hi;
		}
		for(int i=0;i<num;i++) {
			System.out.println(fib[i]);
		}
	}
}
