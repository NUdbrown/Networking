package dbrown_network;

public class Model{

	private int numToGuess = 0;
	
	public int guess(int userGuess) {

		if (getNumToGuess() > userGuess) {
			System.out.println("Too Low!");
			return 1;
		}else if (getNumToGuess() < userGuess) {
			System.out.println("Too High!");
			return -1;
		}
		System.out.println("Correct!");
		return 0;
	}

	public int getNumToGuess() {
		return numToGuess;
	}

	public void setNumToGuess(int numToGuess) {
		this.numToGuess = numToGuess;
	}

	
}
