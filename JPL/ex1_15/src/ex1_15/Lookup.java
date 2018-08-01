package ex1_15;

public interface Lookup {
	/** name と関連付けされた値を返す
	 * そのような値がなければnullを返す  */
	Object find(String name);
	
	/** name と nameに関連付けた value を追加する
	 * 既にnameと関連付いた値があれば上書き */
	void add(String name, Object value);
	
	/** name と関連付けされた値を削除する
	 * そのような値がなければnullを返す */
	void remove(String name);
	
}
