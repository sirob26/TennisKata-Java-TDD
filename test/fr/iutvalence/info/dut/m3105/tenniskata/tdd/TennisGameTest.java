package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void newTennisGameAndScoreequalsLoveAll()
	{
		TennisGame tennisGame = new TennisGame();
		assertEquals(tennisGame.getScore(), "Love-all");
	}
	
	@Test
	public void playerOneScoreAfterBeginning()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScore();
		assertEquals(tennisGame.getScore(), "Fifteen-Love");
	}

	@Test
	public void playerTwoScoreAfterBeginning()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.playerTwoScore();
		assertEquals(tennisGame.getScore(), "Love-Fifteen");
	}
}
