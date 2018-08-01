
public class square {
	/** 50未満の平方を表示 */
	public static void main(String[] args) {
		int value = 1;
		int square = value*value;
		while(square<50) {
			System.out.println(value+" => "+square);
			value++;
			square = value*value;
		}
	}
}
