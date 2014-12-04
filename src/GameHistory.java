import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GameHistory implements Iterable<Turn> {
	private List<Turn> turns;
	
	public GameHistory() { }
	
	public void addTurn(Turn turn) {
		turns.add(turn);
	}
	
	public List<RPSOption> getTurns(int player) {
		List<RPSOption> playerTurns = new ArrayList<RPSOption>();
		for(Turn turn : turns)
			playerTurns.add(turn.getChoice(player));
		return playerTurns;
	}

	@Override
	public Iterator<Turn> iterator() {
		return turns.iterator();
	}
	
	public int turnCount() {
		return turns.size();
	}
	
}
