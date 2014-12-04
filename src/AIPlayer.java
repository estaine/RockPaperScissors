import java.util.Iterator;


public class AIPlayer extends Player {

	public AIPlayer(GameHistory history) {
		super(history);
		human = false;
	}
	
	public static RPSOption convertFromIntToRPSOption(int choice) {
		switch(choice) {
		case 0 : return RPSOption.Rock;
		case 1 : return RPSOption.Paper;
		case 2:  return RPSOption.Scissors; 
		}
		return null;
	}
	
	private double calculateDependency() {
		int totalTurns = history.turnCount();
		
		if(totalTurns < 2)
			return 0;
		else{
			//for(int turnNumber = 1; turnNumber < history.)
		}
		return 0;
	}
	
	@Override
	public RPSOption nextTurn() {
		// TODO Auto-generated method stub
		return null;
	}

}
