package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame tennisGame ;
	
	private void newTennisGame(){
		this.tennisGame = new TennisGame();
	}
	
	
	@Test
	public void newTennisGameAndScoreequalsLoveAll()
	{
		newTennisGame();
		assertEquals(tennisGame.getScore(), "Love-all");
	}
	
	@Test
	public void playerOneScoreAfterBeginning()
	{
		newTennisGame();
		tennisGame.playerOneScore();
		assertEquals(tennisGame.getScore(), "Fifteen-Love");
	}

	@Test
	public void playerTwoScoreAfterBeginning()
	{
		newTennisGame();
		tennisGame.playerTwoScore();
		assertEquals(tennisGame.getScore(), "Love-Fifteen");
	}
	

}
