package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private String score;
	
	public TennisGame(){
		this.score = "Love-all";
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public void playerOneScore() {
		this.score = "Fifteen-Love";
	}

	public void playerTwoScore() {
		this.score = "Love-Fifteen";
	}
	
}
