package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void aSimpleBeginningTest()
	{
		TennisGame tennisGame = new TennisGame();
		assertEquals(tennisGame.score, "Love-all");
	}
	
	@Test
	public void playerOneScoreAfterBeginning()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScore();
		assertEquals(tennisGame.score, "Fifteen-love");
	}

}
