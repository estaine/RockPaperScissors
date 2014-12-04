
public class Turn {
	private RPSOption[] choices;
	
	public Turn(int players) {
		choices = new RPSOption[players];
	}
	
	public void setChoice(int player, RPSOption value) {
		choices[player] = value;
	}
	
	public RPSOption getChoice(int player) {
		return choices[player];
	}
}
