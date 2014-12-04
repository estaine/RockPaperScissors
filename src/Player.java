
abstract public class Player {
	protected boolean human;
	protected GameHistory history; 
	
	public Player(GameHistory history) {
		this.history = history;
	}
	
	abstract public RPSOption nextTurn();
	
	public boolean isHuman() { return human; }
}
