package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	
	private String scorePlayerOne;
	private String scorePlayerTwo;
	
	public TennisGame(){
		this.scorePlayerOne = "Love";
		this.scorePlayerTwo = "Love";
	}

	public String getScore() {
		if(this.scorePlayerOne == this.scorePlayerTwo)
			return this.scorePlayerOne +"-all";
		else
			return this.scorePlayerOne +"-"+ this.scorePlayerTwo;
	}


	public void playerOneScore() {
		this.scorePlayerOne = "Fifteen";
	}

	public void playerTwoScore() {
		this.scorePlayerTwo = "Fifteen";
	}
	
}
