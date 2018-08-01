package ex1_14;

public class Walkman2 extends Walkman {

	private String terminal2;
	
	public Walkman2() {
		super();
		this.terminal2 ="";
	}
	
	public void SetTape(Tape tape) {
		this.SetTape(tape);
	}
	
	public void SetTerminal(String music) {
		super.SetTerminal(music);
		this.terminal2 = music;
	}
	
	public void Run() {
		this.SetTerminal(String.valueOf(super.GetTape().contents));
	}

}
