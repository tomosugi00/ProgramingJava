package ex1_14;

public class Walkman {
	private Tape tape;	    //　 セットされてるカセットテープ
	private String terminal;	//　 端子1
	
	/*　 良い感じにコンストラクタ作りたい */
	Walkman(){
		this.tape = new Tape();
		this.terminal ="";
	}
	
	public void SetTape(Tape tape) {
		this.tape = tape;
	}
	public Tape GetTape() {
		return this.tape;
	}
	
	public void SetTerminal(String music) {
		this.terminal = music;
	}
	
	/*　 再生 */
	public void Run() {
		SetTerminal(String.valueOf(this.tape.contents));
	}
	public void Rewind(){
		
	}
	public void Fastforward() {
		
	}
	
}
