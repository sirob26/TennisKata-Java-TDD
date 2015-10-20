package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	String scoreTable[] = {"Love", "Fifteen", "Thirty", "Forty", "Game"};
	
	
	private int scorePlayerOne;
	private int scorePlayerTwo;
	
	public TennisGame(){
		this.scorePlayerOne = 0;
		this.scorePlayerTwo = 0;
	}

	public String getScore() {
		if(this.scorePlayerOne == this.scorePlayerTwo){
			if (this.scorePlayerOne == 3 & this.scorePlayerTwo == 3) 
				return "Deuce";
			else
				return scoreTable[this.scorePlayerOne] +"-all";
		}
		else
			return scoreTable[this.scorePlayerOne] +"-"+ scoreTable[this.scorePlayerTwo];
	}


	public void playerOneScore() {
		this.scorePlayerOne += 1;
	}

	public void playerTwoScore() {
		this.scorePlayerTwo += 1 ;
	}
	
}
