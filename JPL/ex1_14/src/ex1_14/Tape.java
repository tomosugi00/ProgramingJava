package ex1_14;

/*
 * テープっぽいクラス
 * 本当はテープクラスを継承したカセットテープクラスとか作った方がそれっぽい
*/
public class Tape {
	int maxTime;	  //　 最大録画時間
	int currentTime;  //　 現在の再生中の時間
	boolean enableRecord; //　 録画テープのツメ
	char[] contents;  //　 テープの中身
	
	Tape() {
		this.maxTime = 90;
		this.currentTime = 0;
		this.enableRecord = true;
		this.contents = new char[maxTime];
	}
	Tape(int max,int current,boolean record){
		this.maxTime = max;
		this.currentTime = current;
		this.enableRecord = record;
		this.contents = new char[maxTime];
	}
	
	public void SetCurrentTime(int current) {
		this.currentTime = current;
	}
	
}
