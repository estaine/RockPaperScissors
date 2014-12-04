import java.io.IOException;


public class HumanPlayer extends Player {

	public HumanPlayer(GameHistory history) {
		super(history);
		human = true;
	}
	
	public static RPSOption convertSymbolToRPSOption(int input) {
		switch(input) {
		case 82:
		case 114:
			return RPSOption.Rock;
		case 80:
		case 112:
			return RPSOption.Paper;
		case 83:
		case 115:
			return RPSOption.Scissors;
		}
		
		return null;
	}
	
	@Override
	public RPSOption nextTurn() {
		int enteredChoice = 0;
		try {
			enteredChoice = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return convertSymbolToRPSOption(enteredChoice);
	}

}
